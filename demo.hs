-- Funcao para calcular o imposto de renda
calcIr::(Double,Double) -> Double
calcIr(renda, inss) = baseDeCalculo (renda, inss) * 0.27
	where
		baseDeCalculo::(Double, Double) -> Double
		baseDeCalculo (salario, imposto) = salario - imposto
