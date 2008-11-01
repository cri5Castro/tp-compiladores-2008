/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lexico;

/**
 *
 * @author Germán Hüttemann
 * @author Marcelo Rodas
 * @see TokenExprReg
 */
public class Token {
    
    /**
     * Identificador del token.
     */
    private TokenExprReg ident;
    
    /**
     * Valor del token.
     */
    private String valor;
    
    /**
     * 
     * @param token
     */
    public Token(TokenExprReg token) throws Exception {
        if (token == TokenExprReg.CERO_MAS) {
            ident = TokenExprReg.CERO_MAS;
            valor = "*";
        }
        else if (token == TokenExprReg.CERO_UNO) {
            ident = TokenExprReg.CERO_UNO;
            valor = "?";
        }
        else if (token == TokenExprReg.UNO_MAS) {
            ident = TokenExprReg.UNO_MAS;
            valor = "+";
        }
        else if (token == TokenExprReg.CONCAT) {
            ident = TokenExprReg.CONCAT;
            valor = "";
        }
        else if (token == TokenExprReg.OPCION) {
            ident = TokenExprReg.OPCION;
            valor = "|";
        }
        else if (token == TokenExprReg.PAREN_DER) {
            ident = TokenExprReg.PAREN_DER;
            valor = ")";
        }
        else if (token == TokenExprReg.PAREN_IZQ) {
            ident = TokenExprReg.PAREN_IZQ;
            valor = "(";
        }
        else if (token == TokenExprReg.FINAL) {
            ident = TokenExprReg.FINAL;
            valor = "";
        }
        else if (token == TokenExprReg.DESCONOCIDO) {
            ident = TokenExprReg.DESCONOCIDO;
            valor = "";
        }
        else {
            throw new Exception("Token inválido");
        }
    }
    
    public Token(String simbolo) {
        ident = TokenExprReg.SIM_LEN;
        valor = simbolo;
    }

    @Override
    public String toString() {
        return valor;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Token other = (Token) obj;
        if (this.ident != other.ident) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.ident != null ? this.ident.hashCode() : 0);
        hash = 59 * hash + (this.valor != null ? this.valor.hashCode() : 0);
        return hash;
    }
}