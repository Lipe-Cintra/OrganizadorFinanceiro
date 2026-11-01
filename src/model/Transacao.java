package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {
    private int id;
    private String descricao;
    private BigDecimal valor;
    private TipoTransacao tipo;
    private String categoria;
    private LocalDate data;


    /*CONSTRUTOR*/
    public Transacao(String descricao, BigDecimal valor, TipoTransacao tipo, String categoria, LocalDate data){

        if (descricao == null || descricao.isBlank()){
            throw new IllegalArgumentException("A descrição não pode estar vazia.");
        }
        if(valor == null || valor.compareTo(BigDecimal.ZERO)<=0){
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
        if (tipo == null){
            throw new IllegalArgumentException("O tipo da transação é obrigatório.");
        }
        if(categoria == null || categoria.isBlank()){
            throw new IllegalArgumentException("A categoria não pode estar vazia.");
        }
        if(data == null){
            throw new IllegalArgumentException("A data é obrigatória.");
        }

        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.categoria = categoria;
        this.data = data;
    }

    public int getId(){
        return id;
    }
    public BigDecimal getValor(){
        return valor;
    }
    public String getDescricao(){
        return descricao;
    }
    public TipoTransacao getTipo(){
        return tipo;
    }
    public String getCategoria(){
        return categoria;
    }
    public LocalDate getData(){
        return data;
    }
}