func somar(a, b int, canal chan int) {
    canal <- a + b // envia pro canal
}

func main() {
    canal := make(chan int)
    
    go somar(5, 3, canal)
    
    resultado := <-canal // recebe do canal
    fmt.Println(resultado) // 8
}