package id.kosanit.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomBroadCastReceiver extends BroadcastReceiver {

       public CustomBroadCastReceiver() {
       }

       @Override
       public void onReceive(Context context, Intent intent) {

           if (intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)) {
               Toast.makeText(context, "Handphone Mengecas!", Toast.LENGTH_SHORT).show();
           } else {
               intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED);
               Toast.makeText(context, "Handphone Tidak Mengecas!", Toast.LENGTH_SHORT).show();
           }
       }
}
