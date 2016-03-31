-- soma de dois inteiros
soma::(Integer,Integer) -> Integer

soma (0, n) = n
soma (m,n) = soma(m-1, n+1)


-- Fatorial de um inteiro

fat::Integer -> Integer

fat(0) = 1
fat(n) = n * fat(n-1)   
