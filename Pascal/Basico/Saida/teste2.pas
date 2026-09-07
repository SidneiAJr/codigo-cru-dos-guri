program Teste;

uses crt;

var
  nome: string;
  idade: integer;

begin
  clrscr;
  writeln('Qual seu nome?');
  readln(nome);
  writeln('Quantos anos voce tem?');
  readln(idade);
  writeln('OI', nome,'Voce tem', idade ,'anos');
  readkey;
end.
