def pow_algo1(x, n) :
	if (n == 0) :
		return 1
	return x*pow_algo1(x,n-1)

def aux_algo1(x, n, aux) :
	if (n == 0) :
		return aux
	return aux_algo1(x, n-1, aux*x)

def pow_algo1_term(x, n) :
	return aux_algo1(x, n, 1)

def pow_algo2(x, n) :
	if (n == 0) :
		return 1
	p = n//2
	if (n%2 == 0) :
		return pow_algo2(x*x,p)
	return x * pow(x*x,p)

#algo exponentiation rapide en récursion terminale...

print("Algo naïf")
print(pow_algo1(2,8))
print(pow_algo1_term(2,10))
print("Algo exponentiation rapide")
print(pow_algo2(2,8))

#faire exploser la pile d'exécution!!
#print(pow_algo1(2,998))
#print(pow_algo1_term(2,997))
print(pow_algo2(2,10000000)) #temps de calcul un peu long réessayer avec valeur plus grande
