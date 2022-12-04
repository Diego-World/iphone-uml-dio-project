package com.fakeapple.smartphone;


import com.fakeapple.browser.NavegadorDeInternet;
import com.fakeapple.browser.Safari;
import com.fakeapple.device.Device;
import com.fakeapple.discador.AparelhoTelefonico;
import com.fakeapple.discador.DiscadorApple;
import com.fakeapple.mp3.Ipod;
import com.fakeapple.mp3.ReprodutorMusical;

public class iPhone {
    public static void main(String[] args) {

        NavegadorDeInternet navegadorDeInternet = new Safari();
        NavegadorDeInternet navegadorDeInternet2 = new Device();

        navegadorDeInternet.exibirPagina();
        navegadorDeInternet2.exibirPagina();
    }

}
