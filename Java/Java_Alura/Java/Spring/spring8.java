 public <T> T somaConteudoNaCaixa(T valor) {
        if (this.conteudo instanceof Integer c && valor instanceof Integer i) {
           Integer resultado = c + i;
           return (T) resultado;
        } else if (this.conteudo instanceof Double c && valor instanceof Double d) {
            Double resultado = c + d;
            return (T) resultado;
        } else if (this.conteudo instanceof String c && valor instanceof String s) {
            String resultado = c + "\n" + s;
            return (T) resultado;
        }

        return null;
    }
