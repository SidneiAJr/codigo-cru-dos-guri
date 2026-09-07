package main

import "fmt"

type User struct {
    Nome  string
    Idade int
}

func (u User) Saudar() string {
    return fmt.Sprintf("Oi, sou %s!", u.Nome)
}

func (u *User) Aniversario() {
    u.Idade++
    fmt.Printf("Agora tem %d anos!\n", u.Idade)
}

func main() {
    user := User{Nome: "Teste", Idade: 42}
    fmt.Println(user.Saudar())
    user.Aniversario()
}