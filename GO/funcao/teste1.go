func somar(a int, b int) int {
    return a + b
}

// multiplos retornos - exclusividade do Go!
func dividir(a, b float64) (float64, error) {
    if b == 0 {
        return 0, fmt.Errorf("divisao por zero!")
    }
    return a / b, nil
}

func main() {
    fmt.Println(somar(5, 3)) // 8

    resultado, err := dividir(10, 2)
    if err != nil {
        fmt.Println("Erro:", err)
    } else {
        fmt.Println(resultado) // 5
    }
}