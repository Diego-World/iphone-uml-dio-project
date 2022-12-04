package com.fakeapple.browser;

public class Safari implements NavegadorDeInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página via Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar página via Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página via Safari");
    }
}
