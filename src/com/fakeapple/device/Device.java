package com.fakeapple.device;

import com.fakeapple.browser.NavegadorDeInternet;
import com.fakeapple.discador.AparelhoTelefonico;
import com.fakeapple.mp3.ReprodutorMusical;

public class Device implements NavegadorDeInternet, AparelhoTelefonico, ReprodutorMusical {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página via Device");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via Device");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página via Device");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Fazendo ligação via Device");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação via Device");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz via Device");
    }
    @Override
    public void tocarMusica() {
        System.out.println("Tocando Musica via Device");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica via Device");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica via Device");
    }
}
