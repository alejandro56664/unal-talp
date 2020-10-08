# Traducción dirigida por la sintaxis (TDS-SDT)

## Gramática base

| Regla  | Definición |
|---|---|
| S  | TipoFun L puntoycoma  |
| TipoFun  |  void |
| TipoFun  |  int |
| TipoFun  |  float |
| L  |  F Lp |
| Lp  |  coma F Lp |
| Lp  |  epsilon |
| F  |  ident Lpar A rpar |
| A  |  void |
| A  |  Argu M |
| M  |  coma Argu M |
| M  |  epsilon |
| Argu  |  Tipo ident |
| Argu  |  Tipo asterisco ident |
| Tipo  |  int |
| Tipo  |  float |

## ETDS: Esquema de Traducción Dirigido por la Sintaxis

- gramática de atributos
- acciones semánticas se insertan en la parte derecha de las reglas

### Gramática de atributos

| Regla  | Definición | Acción semántica |
|---|---|---|
| S  | TipoFun L puntoycoma  | { L.tfh := TipoFun.trad } { S.Trad := L.trad + ";"}  |
| TipoFun  |  void | { TipoFun.trad := "" } |
| TipoFun  |  int | { TipoFun.trad := "integer" } |
| TipoFun  |  float | { TipoFun.trad := "real" } |
| L  |  F Lp | { F.tfh := L.tfh; Lp.tfh = L.tfh; } { L.trad =  F.trad + "; " + Lp.trad } |
| Lp  |  coma F Lp | { F.tfh := Lp.tfh; Lp1.th := Lp.tfh; } { Lp.trad := F.trad + "; " + Lp1.trad } |
| Lp  |  epsilon | { Lp.trad := "" } |
| F  |  ident Lpar A rpar | { _Si_ F.tfh == "" _entonces_ F.trad := "procedure" + ident.lexema + "(" + A.trad + ")"  |
| | | { _de lo contrario_ F.trad := "function " + ident.lexema + "(" + A.trad + ")" + ":" F.tfh } |
| A  |  void | { A.trad := "" } |
| A  |  Argu M | { A.trad := Argu.trad + M.trad } |
| M  |  coma Argu M | { M.trad := ", " + Argu.trad + M1.trad} |
| M  |  epsilon | { M.trad := "" } |
| Argu  |  Tipo ident | { Argu.trad := ident.lexema + ": " + Tipo.trad } |
| Argu  |  Tipo asterisco ident | { Argu.trad := "var " + ident.lexema + ": " + Tipo.trad }  |
| Tipo  |  int | { Tipo.trad := "integer" } |
| Tipo  |  float | { Tipo.trad := "real" } |
      

### EDTS
```
S       -> TipoFun { L.tfh := TipoFun.trad } L puntoycoma      { S.Trad := L.trad || ";" } 

TipoFun -> void  { TipoFun.trad := "" }
TipoFun -> int   { TipoFun.trad := "integer" }
TipoFun -> float { TipoFun.trad := "real" }


L       -> { F.tfh := L.tfh} F { Lp.tfh = L.tfh }  Lp { L.trad =  F.trad || "; " || Lp.trad }

Lp      -> coma { F.tfh := Lp.tfh } F { Lp1.th := Lp.tfh } Lp  { Lp.trad := F.trad || "; " || Lp1.trad }
Lp      -> epsilon { Lp.trad := "" } 

F       -> ident Lpar A rpar        { Si F.tfh == "" F.trad := "procedure" || ident.lexema || "(" || A.trad || ")" 
                                      de lo contrario F.trad := "function " || ident.lexema || "(" || A.trad || ")" || ":" F.tfh }
                                      
A       -> void                     { A.trad := "" }
A       -> Argu M                   { A.trad := Argu.trad || M.trad }
M       -> coma Argu M              { M.trad := ", " || Argu.trad || M1.trad}
M       -> epsilon                  { M.trad := "" }
Argu    -> Tipo ident               { Argu.trad := ident.lexema || ": " || Tipo.trad }
Argu    -> Tipo asterisco ident     { Argu.trad := "var " || ident.lexema || ": " || Tipo.trad } 
Tipo    -> int                      { Tipo.trad := "integer" }
Tipo    -> float                    { Tipo.trad := "real" }
```