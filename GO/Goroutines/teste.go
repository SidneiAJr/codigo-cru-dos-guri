import (
    "fmt"
    "time"
)

func tarefa(nome string) {
    for i := 0; i < 3; i++ {
        fmt.Println(nome, i)
        time.Sleep(100 * time.Millisecond)
    }
}

func main() {
    go tarefa("A") // roda em paralelo!
    go tarefa("B") // roda em paralelo!
    
    time.Sleep(1 * time.Second) // espera terminar
}
// A 0, B 0, A 1, B 1... misturado!