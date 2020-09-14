lexer grammar bcc;

/*
Donde nombre_token será determinado de la siguiente manera: tk_nombre_token.
El nombre_token debe ser alguno de la siguiente lista:

tk_mayor,
tk_mayor_igual,
tk_menor,
tk_menor_igual,
tk_asignacion,
tk_sum_asig,
tk_res_asig,
tk_mul_asig,
tk_div_asig,
tk_mod_asig,
tk_igualdad,
tk_diferente,
tk_incremento,
tk_decremento,
tk_llave_izq,
tk_llave_der,
tk_par_izq,
tk_par_der,
tk_mas,
tk_menos,
tk_mul,
tk_div,
tk_mod,
tk_coma,
tk_puntoycoma,
tk_dospuntos. P

Para mayor claridad para saber cómo usarlos, refiérase a los ejemplos anteriores.

 */

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
