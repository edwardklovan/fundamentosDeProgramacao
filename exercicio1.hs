-- soma de dois inteiros
soma::(Integer,Integer) -> Integer

soma (0, n) = n
soma (m,n) = soma(m-1, n+1)  
