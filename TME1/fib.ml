let rec fib n=
  if (n==1 || n==2)
  then 1
  else (fib(n-1)+fib(n-2));;

print_int (fib(int_of_string Sys.argv.(1)));;
print_string "\n";;