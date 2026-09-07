program Funcoes;

uses crt;

{ PROCEDURE - nao retorna nada }
procedure Saudar(nome: string);
begin
  writeln('Oi, ', nome, '!');
end;

{ FUNCTION - retorna um valor }
function Somar(a, b: integer): integer;
begin
  Somar := a + b;  { aqui e diferente! voce atribui ao NOME da funcao }
end;

function EhMaior(a, b: integer): boolean;
begin
  if a > b then
    EhMaior := true
  else
    EhMaior := false;
end;

{ PROGRAMA PRINCIPAL }
var
  resultado: integer;

begin
  clrscr;

  Saudar('Vapo');

  resultado := Somar(10, 5);
  writeln('10 + 5 = ', resultado);

  if EhMaior(8, 3) then
    writeln('8 e maior que 3')
  else
    writeln('3 e maior que 8');

  readkey;
end.