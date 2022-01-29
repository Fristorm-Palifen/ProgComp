let rec pow_algo x n =
	if (n=0)
	then 1
	else x * (pow_algo x (n-1));;
	
(* Erreur de syntaxe que je comprends pas...
let pow_algo_term x n =
	let rec loop n acc =
		if (n = 0) then acc
		else (loop (n-1) (acc*x));;
	loop n 1;;*)

print_int (pow_algo 2 8);;
print_string("\n");;
(*print_int (pow_algo_term 2 8);;
print_string("\n");;*)
