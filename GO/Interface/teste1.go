type Animal interface {
    Som() string
    Mover() string
}

type Cachorro struct{ Nome string }
type Peixe struct{ Nome string }

func (c Cachorro) Som() string   { return "Au!" }
func (c Cachorro) Mover() string { return "correndo!" }

func (p Peixe) Som() string   { return "..." }
func (p Peixe) Mover() string { return "nadando!" }

// qualquer struct que tem Som() e Mover() e um Animal automatico!
func Descrever(a Animal) {
    fmt.Println(a.Som(), a.Mover())
}

func main() {
    Descrever(Cachorro{Nome: "Rex"}) // Au! correndo!
    Descrever(Peixe{Nome: "Nemo"})  // ... nadando!
}