fn main() {
    let x = 10;

    // if como expressao!
    let resultado = if x > 5 { "maior" } else { "menor" };
    println!("{}", resultado);

    // loop
    let mut i = 0;
    while i < 3 {
        println!("i = {}", i);
        i += 1;
    }

    // for
    for n in 1..=5 {
        println!("{}", n); // 1 2 3 4 5
    }

    // array
    let nums = [10, 20, 30];
    for n in nums {
        println!("{}", n);
    }
}