package com.bootongeek.ENTViewer;

import com.bootongeek.ENTViewer.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class HelpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
		/*String help = 
				"<head>" +
				"</head>" +
				"<body>" +
				"	<h1>Aide</h1>" +
				"<p>" +
				"	Bienvenue dans le programme <strong>Inform'aix Ent Viewer</strong>, ce dernier permet la visualisation " +
				"	rapide de son emplois du temps.<br>" +
				"	Ce programme est d&eacute;velopp&eacute; par Jonathan BAUDIN [<a href='http://www.bootongeek.com/'>http://www.bootongeek.com</a>]." +
				"	Les sources sont disponible sous GitHub [Lien &agrave; venir]" +
				"</p>" +
				"<p>" +
				"	<h3>D&eacute;tails de l'interface</h3>" +
				"	<img src='calendar_thisweek.png' alt='calendar this week' /> : " +
				"	Affiche l'emplois du temps de la semaine actuelle. (En fonction de la ressource choisie et des r&eacute;glages).<br>" +
				"	<img src='reglage.png' alt='reglage' /> : Affiche la fen&ecirc;tre des r&eacute;glages." +
				"</p>" +
				"<p>" +
				"	<h3>Comment afficher mon emplois du temps ?</h3>" +
				"	Pour afficher votre emplois du temps, il vous faut s&eacute;lectionner votre ressource (votre groupe et ann&eacute;e [ou nom])" +
				"	puis de revenir en arri&egrave;re et enfin d'actualiser.<br>" +
				"	Le programme t&eacute;l&eacute;chargera l'emplois du temps, l'enregistrera et l'affichera." +
				"</p>" +
				"<p>" +
				"	<h3>Comment consulter mon emplois du temps sans connexion internet ?</h3>" +
				"	Il est &eacute;vident que sans connexion internet la visualisation de l'emplois du temps est impossible.<br>" +
				"	En revanche le programme enregistre le DERNIER emplois du temps consult&eacute; et l'affichera &agrave; chaque d&eacute;marrage." +
				"</p>" +
				"<p>" +
				"	<h3>Je suis un prof. et mon nom n'est pas dans liste ! Que faire ?</h3>" +
				"	NE PLEUREZ PAS !!!<br>" +
				"	Si votre nom n'est pas dans liste de choix des ressources, cela ne vient pas du fait que l'on ne vous aimes pas, mais que la " +
				"	liste n'est pas exhaustive ! Envoyez un mail &agrave; la personne charg&eacute;e de la maintenance du programme !" +
				"</p>" +
				"<br><br>" +
				"<p>" +
				"	Longue vie &agrave; Android, &agrave; NedSeb, au <a href='http://labaixbidouille.com/'>L.A.B</a>, au exception AouteOfRange et au #FF<br>" +
				"	Gardez foi, on trouvera bien un moyen de se d&eacute;barraser du Java ! :-p" +
				"</p>";*/
		((WebView) findViewById(R.id.webViewHelp)).loadUrl("file:///android_asset/help.html");
		((Button) findViewById(R.id.btnHelpFermer)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

}
