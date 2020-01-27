package com.example.peter.ashardalontranslated;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShowCardInfo extends Activity {
    String[] info;
    int cardN;

    //Encounter Cards
    TextView encCardType;
    TextView encCardName;
    TextView encCardLore;
    TextView encCardSpec;
    TextView encCardDesc;
    TextView encCardAtac;
    TextView encCardDmgH;
    TextView encCardDmgM;
    TextView encCardBott;
    LinearLayout layEncCardTop;
    LinearLayout layEncCardLore;
    LinearLayout layEncCardDamage;
    LinearLayout layEncCardBott;
    LinearLayout layEncCardSpec;

    //Monster Cards
    TextView monCardType;
    TextView monCardName;
    TextView monCardAC;
    TextView monCardHP;
    TextView monCardFirstCon;
    TextView monCardFirstDesc;
    TextView monCardSecondCon;
    TextView monCardSecondDesc;
    TextView monCardThirdCon;
    TextView monCardThirdDesc;
    TextView monCardAtName1;
    TextView monCardAtName2;
    TextView monCardAtBonus1;
    TextView monCardAtBonus2;
    TextView monCardAtDmgH1;
    TextView monCardAtDmgH2;
    TextView monCardAtDmgM1;
    TextView monCardAtDmgM2;
    TextView monCardXP;
    TextView monCardVilager;
    LinearLayout layMonSecondAttack;
    LinearLayout layMonFirstAttack;
    LinearLayout layMonTop;
    LinearLayout layMonArmorHealth;
    LinearLayout layMonXP;

    //Item
    TextView itmCardName;
    TextView itmCardLore;
    TextView itmCardSpec;
    TextView itmCardText;
    TextView itmCardPrice;
    TextView itmCardAtk;
    TextView itmCardDmgH;
    TextView itmCardDmgM;
    TextView itmCardBot;
    LinearLayout layItmAtk;
    LinearLayout layItmBot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent callingActivity = getIntent();
        info = callingActivity.getExtras().getStringArray("texts");
        cardN = callingActivity.getExtras().getInt("cardN");

        if(cardN >= 50 && cardN <= 103){
            setContentView(R.layout.card_info_layout_encounter);
            encCardType = (TextView) findViewById(R.id.tvEncCardType);
            encCardName = (TextView) findViewById(R.id.tvEncCardName);
            encCardLore = (TextView) findViewById(R.id.tvEncCardLore);
            encCardSpec = (TextView) findViewById(R.id.tvEncCardSpecial);
            encCardDesc = (TextView) findViewById(R.id.tvEncCardText);
            encCardAtac = (TextView) findViewById(R.id.tvEncCardAtac);
            encCardDmgH = (TextView) findViewById(R.id.tvEncCardDmgH);
            encCardDmgM = (TextView) findViewById(R.id.tvEncCardDmgM);
            encCardBott = (TextView) findViewById(R.id.tvEncCardBotton);
            layEncCardTop = (LinearLayout) findViewById(R.id.layEncCardTop);
            layEncCardLore = (LinearLayout) findViewById(R.id.layEncCardLore);
            layEncCardDamage = (LinearLayout) findViewById(R.id.layEncCardDamage);
            layEncCardBott = (LinearLayout) findViewById(R.id.layEncCardBotton);
            layEncCardSpec = (LinearLayout) findViewById(R.id.layEncCardSpecial);

            encCardName.setText(info[0]);
            encCardLore.setText(info[1]);

            if(cardN < 59) { //Curse
                encCardType.setText("MALDIÇÂO");

                layEncCardTop.setBackgroundColor(Color.parseColor("#06380c"));
                layEncCardLore.setBackgroundColor(Color.parseColor("#1e601e"));

                encCardDesc.setText(info[2]);
                encCardBott.setText(info[3]);
                layEncCardDamage.setVisibility(View.INVISIBLE);
                layEncCardSpec.setVisibility(View.GONE);
            }
            else if(cardN < 65){ //Environment
                encCardType.setText("AMBIENTE");
                encCardSpec.setText(info[2]);
                encCardDesc.setText(info[3]);

                layEncCardTop.setBackgroundColor(Color.parseColor("#8116b7"));
                layEncCardLore.setBackgroundColor(Color.parseColor("#a61eea"));

                layEncCardBott.setVisibility(View.INVISIBLE);
                layEncCardDamage.setVisibility(View.INVISIBLE);
            }
            else if(cardN < 83) { //Event
                encCardType.setText("EVENTO");
                encCardBott.setText(info[3]);
                encCardDesc.setText(info[2]);

                layEncCardTop.setBackgroundColor(Color.parseColor("#9b9b41"));
                layEncCardLore.setBackgroundColor(Color.parseColor("#c1c141"));

                layEncCardDamage.setVisibility(View.INVISIBLE);
                layEncCardSpec.setVisibility(View.GONE);
            }
            else if(cardN < 97) { //Event - Attack
                encCardType.setText("EVENTO - ATAQUE");
                encCardDesc.setText(info[2]);
                encCardAtac.setText(info[3]);
                encCardDmgH.setText(info[4]);
                encCardDmgM.setText(info[5]);
                encCardBott.setText(info[6]);

                layEncCardTop.setBackgroundColor(Color.parseColor("#bc3a0b"));
                layEncCardLore.setBackgroundColor(Color.parseColor("#c95328"));
                layEncCardDamage.setBackgroundColor(Color.parseColor("#bc3a0b"));
                layEncCardSpec.setVisibility(View.GONE);
            }
            else if(cardN < 100){ //Hazard
                encCardType.setText("DESASTRE");
                layEncCardTop.setBackgroundColor(Color.parseColor("#a88617"));
                layEncCardLore.setBackgroundColor(Color.parseColor("#d1a71f"));
                layEncCardDamage.setBackgroundColor(Color.parseColor("#a88617"));
                if(cardN == 99){
                    layEncCardDamage.setVisibility(View.INVISIBLE);
                }

                encCardSpec.setText(info[2]);
                encCardDesc.setText(info[3]);
                encCardAtac.setText(info[4]);
                encCardDmgH.setText(info[5]);
                encCardDmgM.setText(info[6]);
                encCardBott.setText(info[7]);
            }
            else{
                encCardType.setText("ARMADILHA");
                layEncCardTop.setBackgroundColor(Color.parseColor("#117391"));
                layEncCardLore.setBackgroundColor(Color.parseColor("#16a1cc"));
                layEncCardDamage.setBackgroundColor(Color.parseColor("#117391"));
                if(cardN == 100 || cardN == 102){
                    layEncCardDamage.setVisibility(View.INVISIBLE);
                }

                encCardSpec.setText(info[2]);
                encCardDesc.setText(info[3]);
                encCardAtac.setText(info[4]);
                encCardDmgH.setText(info[5]);
                encCardDmgM.setText(info[6]);
                encCardBott.setText(info[7]);
            }
        }
        if(cardN > 103 && cardN <= 133 || cardN > 184 && cardN < 190){
            setContentView(R.layout.card_info_layout_monster);

            monCardType = (TextView) findViewById(R.id.tvMonCardType);
            monCardName = (TextView) findViewById(R.id.tvMonCardName);
            monCardAC = (TextView) findViewById(R.id.tvMonAC);
            monCardHP = (TextView) findViewById(R.id.tvMonHp);
            monCardFirstCon = (TextView) findViewById(R.id.tvMonFCB);
            monCardFirstDesc = (TextView) findViewById(R.id.tvMonFC);
            monCardSecondCon = (TextView) findViewById(R.id.tvMonSCB);
            monCardSecondDesc = (TextView) findViewById(R.id.tvMonSC);
            monCardThirdCon = (TextView) findViewById(R.id.tvMonTCB);
            monCardThirdDesc = (TextView) findViewById(R.id.tvMonTC);
            monCardAtName1 = (TextView) findViewById(R.id.tvMonAtk1);
            monCardAtName2 = (TextView) findViewById(R.id.tvMonAtk2);
            monCardAtBonus1 = (TextView) findViewById(R.id.tvMonCardAtac1);
            monCardAtBonus2 = (TextView) findViewById(R.id.tvMonCardAtac2);
            monCardAtDmgH1 = (TextView) findViewById(R.id.tvMonCardDmgH1);
            monCardAtDmgH2 = (TextView) findViewById(R.id.tvMonCardDmgH2);
            monCardAtDmgM1 = (TextView) findViewById(R.id.tvMonCardDmgM1);
            monCardAtDmgM2 = (TextView) findViewById(R.id.tvMonCardDmgM2);
            monCardXP = (TextView) findViewById(R.id.tvMonCardBotton);
            monCardVilager = (TextView) findViewById(R.id.tvMonVilage);
            layMonSecondAttack = (LinearLayout) findViewById(R.id.layMonCardDamage2);
            layMonFirstAttack = (LinearLayout) findViewById(R.id.layMonCardDamage1);
            layMonTop = (LinearLayout) findViewById(R.id.layMonCardTop);
            layMonArmorHealth = (LinearLayout) findViewById(R.id.layMonACHP);;
            layMonXP= (LinearLayout) findViewById(R.id.layMonCardBotton);

            monCardType.setText(info[0]);
            monCardName.setText(info[1].toUpperCase());
            monCardAC.setText(info[2]);
            monCardHP.setText(info[3]);
            monCardFirstCon.setText(info[4]);
            monCardFirstDesc.setText(info[5]);
            monCardSecondCon.setText(info[6]);
            monCardSecondDesc.setText(info[7]);
            monCardThirdCon.setText(info[8]);
            monCardThirdDesc.setText(info[9]);
            monCardAtName1.setText(info[10]);
            monCardAtName2.setText(info[11]);
            monCardAtBonus1.setText(info[12]);
            monCardAtBonus2.setText(info[13]);
            monCardAtDmgH1.setText(info[14]);
            monCardAtDmgM1.setText(info[15]);
            monCardAtDmgH2.setText(info[16]);
            monCardAtDmgM2.setText(info[17]);
            monCardXP.setText(info[18]);
            layMonFirstAttack.setBackgroundColor(Color.parseColor(info[19]));
            layMonSecondAttack.setBackgroundColor(Color.parseColor(info[19]));
            layMonTop.setBackgroundColor(Color.parseColor(info[19]));
            layMonArmorHealth.setBackgroundColor(Color.parseColor(info[20]));
            layMonXP.setBackgroundColor(Color.parseColor(info[20]));

            if(info[11].isEmpty()){
                layMonSecondAttack.setVisibility(View.GONE);
            }
            if(info[10].isEmpty()){
                monCardAtName1.setVisibility(View.GONE);
            }
            if(cardN > 184){
                monCardVilager.setVisibility(View.VISIBLE);
                monCardVilager.setText(info[1] + " conta como um Herói para as táticas de Monstros.");
                monCardXP.setVisibility(View.INVISIBLE);
                if(info[12].isEmpty()){
                    layMonFirstAttack.setVisibility(View.GONE);
                }
            }
        }
        if(cardN > 133 && cardN < 167){ //Item
            setContentView(R.layout.card_info_layout_item);

            itmCardName = (TextView) findViewById(R.id.tvItmCardName);
            itmCardLore = (TextView) findViewById(R.id.tvItmCardLore);
            itmCardSpec = (TextView) findViewById(R.id.tvItmCardSpecial);
            itmCardText = (TextView) findViewById(R.id.tvItmCardText);
            itmCardPrice = (TextView) findViewById(R.id.tvItmPrice);
            itmCardAtk = (TextView) findViewById(R.id.tvItmCardAtac);
            itmCardDmgH = (TextView) findViewById(R.id.tvItmCardDmgH);
            itmCardDmgM = (TextView) findViewById(R.id.tvItmCardDmgM);
            itmCardBot = (TextView) findViewById(R.id.tvItmCardBotton);
            layItmAtk = (LinearLayout) findViewById(R.id.layItmCardDamage);
            layItmBot = (LinearLayout) findViewById(R.id.layItmCardBotton);

            itmCardName.setText(info[0]);
            itmCardLore.setText(info[1]);
            itmCardSpec.setText(info[2]);
            itmCardText.setText(info[3]);
            itmCardPrice.setText(info[4]);
            itmCardAtk.setText(info[5]);
            itmCardDmgH.setText(info[6]);
            itmCardDmgM.setText(info[7]);
            itmCardBot.setText(info[8]);

            if(info[8].isEmpty()){
                layItmBot.setVisibility(View.INVISIBLE);
            }
            if(info[5].isEmpty()){
                layItmAtk.setVisibility(View.INVISIBLE);
            }
        }
    }
}
