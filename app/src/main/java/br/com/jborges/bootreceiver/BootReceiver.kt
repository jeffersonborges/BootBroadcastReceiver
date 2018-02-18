package br.com.jborges.bootreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.util.logging.Logger


/**
 * Created by jeffe on 18/02/2018.
 */
class BootReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Logger.getLogger(BootReceiver::class.java.name)
                .warning("O sistema esta no ar já posso iniciar meu serviço")
    }

}