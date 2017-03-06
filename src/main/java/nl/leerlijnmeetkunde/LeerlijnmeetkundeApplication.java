package nl.leerlijnmeetkunde;

import nl.leerlijnmeetkunde.domain.Post;
import nl.leerlijnmeetkunde.repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LeerlijnmeetkundeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeerlijnmeetkundeApplication.class, args);
	}

	@Bean
    public CommandLineRunner init(PostRepository postRepository) {
	    return (args) -> {
	        postRepository.save(new Post("Dit is een test", "# Quem mundo\n" +
					"\n" +
					"## Ius naresque ira\n" +
					"\n" +
					"*Lorem markdownum fixo* et ignes: nervi nominat dubiis e *dedit deficit\n" +
					"Aeoliden* et. Docuique falsam quaerit, [precibus et\n" +
					"tendit](http://www.conpositastellus.io/), te cum in iugulata aquis. Inops sunt\n" +
					"Theseus salire fuit qua thalamique infans pia procubuit, sono mons utrumque\n" +
					"exitus, fatentur *clausis*! Nec fuerat inrita; nomina quid tenebat. Fata fieri\n" +
					"mittit, aurataque [parat obstaret pacis](http://www.frustra.net/pictis.html), in\n" +
					"caelo, cruentum verbisque novissima adhuc: quam cum ferarumque?\n" +
					"\n" +
					"## Adparentia vestri cum radiantis de sibila ales\n" +
					"\n" +
					"Eosdem vires quos tu loquendi protinus Frigus inplacataeque certe erigitur oro,\n" +
					"stare Talia vestros iungat. [Anum](http://www.aequor.com/ferro) nefas, feret\n" +
					"*Ulixem corripiunt cucurri* amori [intrarant](http://proboque.net/) anumque\n" +
					"hospes et borean cita obliquo traxit. Nebulae calore agmina mihi: semine qua\n" +
					"inclinata verba movit iacerent, tuli. Fatis aequor: euntem subit tremescere\n" +
					"remittant natus [collis suis moresque](http://www.adiit-est.com/servantes).\n" +
					"\n" +
					"## Per olivae filius\n" +
					"\n" +
					"Dictis me facta patulos; hic suum cedere, Ilus rector. Aristas ore quam et\n" +
					"[non](http://nec.com/difficilem) inducta et ripae animus, nuda ire exspectat\n" +
					"**de et** Cytherea forma, agebatur, aut. [Cum](http://www.sucos-oeneus.com/)\n" +
					"ostendunt ministri hoc *partem dare* adnuit herbas, inde fatis, tuo. Puppibus\n" +
					"invidiosior de dixit; est ille caducum cornua sit gurgite corniger *saxa\n" +
					"opemque*, et fugae velint; et.\n" +
					"\n" +
					"Reparat mutet qui [crearat](http://tu-at.net/cumque-ixiona.html) guttura?\n" +
					"Aeolides similisque Abantiades; auctor facunde comitata. Iaceres feras capax\n" +
					"plangere aliquem. Videre insano ad lignum oblitus.\n" +
					"\n" +
					"## Altam meque in turbatque Pallantias fregit\n" +
					"\n" +
					"Laborant super caelobracchia motu virginis frementis troades cornua, sic et\n" +
					"verba ad murmur ictibus et stetit. Ventis caperet videtur. Linguae reddat?\n" +
					"\n" +
					"1. Nec sum parentis quod veritus lupos\n" +
					"2. Alis campus flet multaque\n" +
					"3. Texit sudem dentes trium adspexerit apulus\n" +
					"\n" +
					"## Sed rogari premens\n" +
					"\n" +
					"Variarum ferarum; manet est corpora aperite dumque tot: nocens quam saepe sentit\n" +
					"deum. Mox asperitas de servato quosque utinam exsultatque priore iugo tellure\n" +
					"*fecit sua* extulit, poscere parentes retinens, lapsum abit.\n" +
					"\n" +
					"> Fractus armis? Indice **aura uteri dabitur** credere mentis plus, est qua\n" +
					"> condita pudor est anguipedum flamma semel, malo. Pro sua per sidera: spectat\n" +
					"> dum orbem retorserunt usus; mens litus quorum. Facti ducunt, ore neu ut orbem\n" +
					"> horas calidis et puniceo **multi securosque** Delo inmansuetique pictae telae.\n" +
					"\n" +
					"Simulacraque ferox et esse vittis **cauda oculis**, o tam. Germana ipse accensus\n" +
					"adspice Tempe. Manu alti omnibus, quod quo satiata ante licentia, graves\n" +
					"promittuntque!"));
	        postRepository.save(new Post("Test 2", "# Teste inpulsumque vincendo illac raptae patriumque secuta\n" +
					"\n" +
					"## Ebur faciemque\n" +
					"\n" +
					"Lorem markdownum erat repetit, et dentes deus; quoquam Melantho silicem nudae\n" +
					"solitumque capax saxa sua olivae fuit: herbae. In tellus me natis iam inque\n" +
					"percussit et Bacchi perque, mihi possumus carmen ut fuerant moenia inmitem\n" +
					"funera, et? Exiluit relictum potuisse ferat caelum partu; cum proque adfata\n" +
					"montes laborum.\n" +
					"\n" +
					"- Templa vela aetate est habebatur habendam petit\n" +
					"- Voces Phoebe videre\n" +
					"- Quoque non ruunt sustinet frater telluris\n" +
					"- Lernaei ignoro\n" +
					"\n" +
					"Rupit a velocior scire Bacchica nec, quod tollit rigescere laqueique hasta.\n" +
					"Decoro magnis recondiderat mitti patuit cognosse animam sanguine quam laudavit,\n" +
					"tu numina in, sua et Mavortis tanti.\n" +
					"\n" +
					"## Longeque est\n" +
					"\n" +
					"E ubique dabant **sua deos belli** rarissima **odoratis exululatque volucrem**.\n" +
					"Defectos iuvenis [et an](http://frondibusedocuit.org/omnes) aevo magna incurrere\n" +
					"mutum Niobe *tepere* fronte mortis? Revulsum et septem lacrimis uritur sonarent\n" +
					"multorumque tempore caede habebat, in moenia propiore.\n" +
					"\n" +
					"Misso in dicta, usus sic, [leto](http://www.exclamant.net/) ubi coeamus, nec.\n" +
					"Omnes sed est molliri, tantum manus, pater alio venias auro vocatus.\n" +
					"\n" +
					"Tenere in parce terret, cum est alterius extremo quem eburno dolore? Tibi ut\n" +
					"misit. Totis et aliis velocius cuius citharam vivitur.\n" +
					"\n" +
					"Et forte resupino Thersites iuncta monumentis et feras corpore puppis ne capillo\n" +
					"vellem viam iam; igitur natorum nominis vel? Pericula corpore Propoetides sors\n" +
					"scopulum."));

	        postRepository.save(new Post("Dit is een titel", "# Telae mundi collum suis fecisse peti\n" +
					"\n" +
					"## Non terga prohibete sic capit lac pervenit\n" +
					"\n" +
					"Lorem markdownum sequemur Iove, hic longi periuria qui prohibere dabat. Qualis\n" +
					"et nec quo baculumque, carmina est futuri vulnere Iovis, se hosti illa\n" +
					"*silentia*. Non duxere sine penates Veneris rogus sonus.\n" +
					"\n" +
					"- Nec ratem O lumina hac\n" +
					"- Erat terrae munere videre totiens Deoida probat\n" +
					"- Ac duxit flammas cucurri a longo incessere\n" +
					"- Ad possit arsuros quibus in\n" +
					"- Mersum suum studiisque et vestri clara nisi\n" +
					"\n" +
					"## Aut at et feret susurra\n" +
					"\n" +
					"Lacus aquas capiat; collo Agenoream cur ut rictus inerti. Loco omnipotens regia\n" +
					"sincera amantibus Doridaque se orbis. Pater at sanguis\n" +
					"[manum](http://coniugisilla.org/), meae sine in vidit nervus, robora ventis.\n" +
					"\n" +
					"> Servantis luridus incunabula movit cum consilii colat, et rupem admovique.\n" +
					"> Lelex institerant venit potest **et** esse aegram, sua caelum derantque\n" +
					"> delubris fetibus gratia. Tantis Iolen **solum in** quondam causam: diu non\n" +
					"> dapibus nec. Chaoque vivis: statque sola oculis [illis\n" +
					"> trucis](http://soporvoce.io/exierat-tuba.html) in est Leucothoe in. Fuit meo\n" +
					"> fugitque causa!\n" +
					"\n" +
					"## Dilapsa vocis properatis habebat\n" +
					"\n" +
					"Coniunx pinu **qua** pedes diversaeque scelus video illo, fecundo recepi? Sua\n" +
					"deducens herbarum **domus**, in moles auferat: illa erit nec foedantem et monte\n" +
					"nitebant. Et et misit an aconita pectore aetate et equo coniunx. Consortia neque\n" +
					"**ex fluunt** cava, mersitque te *possis* forsitan corripit prohibebant undis.\n" +
					"\n" +
					"    if (matrix.animated_direct.latencyOasisCopy(tcp, gigabit_domain,\n" +
					"            interpreter) == print_sli_cloud) {\n" +
					"        zero_processor = basic_friend_google - 183312;\n" +
					"    } else {\n" +
					"        fiber = dial_pipeline_wimax - on;\n" +
					"        lamp_odbc.ttl_service(consoleLeaderboardReal(-4), 28);\n" +
					"        sli = epsNamespaceSpool;\n" +
					"    }\n" +
					"    if (dmaWeb(domain, encoding + modifier_desktop, bar_malware)) {\n" +
					"        rtfLanguageHome.eDomainLpi(protocol + 2);\n" +
					"        reader_configuration_bespoke = ftp.clickPmu(75 + 91);\n" +
					"    } else {\n" +
					"        dpiLaptopAjax = cpaAtmFunction;\n" +
					"        downloadNodePpga = 4;\n" +
					"        onlyIcf.flashRouterFrozen(-1);\n" +
					"    }\n" +
					"    if (gnutellaFlatbedTime.remote_plagiarism_rt(lockRte(\n" +
					"            netbiosPublishingReadme, recursion_youtube)) <= 2) {\n" +
					"        typeEncoding.commercial.fileMasterWddm(wais_memory + barZoneMouse);\n" +
					"        crt_media_megapixel = 1;\n" +
					"    }\n" +
					"    boot.metafile_webmaster_mpeg += 5;\n" +
					"    servletRedundancy = upnp;\n" +
					"\n" +
					"## Sacraria servantis Lemnicolae iustissimus latrantibus lacerto vulnera\n" +
					"\n" +
					"Volucrem tum esse principio ipsam, addenda iacent, ibi? Ulixes iam Phoebo\n" +
					"egreditur praeter patrem; Aurorae corve quoque ad his teretesque se carpitur sed\n" +
					"speciem hominis tergo colla. Detinuit interrumpente saepe vero puppe, et quae.\n" +
					"Factura moderamine i **Erycina gessit** corpore rituque *patriaque hic tu*.\n" +
					"\n" +
					"Vel Cereris tacto. Ab nec ligno palustri dis annus venit esse ultroque\n" +
					"**coxerat** rapite. Reor madefacta pellem semel quoque vincere signaque miscet\n" +
					"nervos receptae maiorque retexi paratus."));

	        postRepository.save(new Post("Title", "# Potiuntur dea ut inseritur coegi\n" +
					"\n" +
					"## Ut rursus\n" +
					"\n" +
					"Lorem markdownum adhuc spemque duobus agresti senatum retentis quoque; hac. Et\n" +
					"annis tenebrae et arborei spargit, deos poma. Non faceret gramen melior flemus,\n" +
					"auras; ritibus *longum*. Eadem Phaethusa [palmae](http://www.tehabet.org/quem),\n" +
					"ignibus flava quoque accinctus ut icto!\n" +
					"\n" +
					"    var laserCommerceZif = seoVpiEps.pixel(requirements - programming_clock);\n" +
					"    cWeb += 99 + definition_modifier_copyright(2 + cdServerHardware);\n" +
					"    var firewallUrlKeyboard = system.bsod(hoverInterpreter.fat(veronicaHdv,\n" +
					"            rosettaFile) + font_backside, mp);\n" +
					"    ethicsDosCopyright += title_raid(volumeRegistry + affiliateWildcardNon - 2,\n" +
					"            drive_boot);\n" +
					"\n" +
					"## Si regis laboribus vera est est bimembres\n" +
					"\n" +
					"Ut sensim et infit, Charybdin Semina si ea quam uvis fontesque haec. Hinc\n" +
					"desertae mihi ducit, constitit et iura: non dura longum dicitur. Ales mota\n" +
					"tuorum et antro isto pondere, Thybris, an fides [iam](http://cum-videtur.io/)\n" +
					"raptaque. Homines *Mercurio* morboque annos faciendis magno auras, Aeneaeque\n" +
					"pernocte.\n" +
					"\n" +
					"## Rapiunt nimium convexum quaque promissaque vino\n" +
					"\n" +
					"Bis lapsasque boves *aethera*. Faciem Othryn est spernit Achilles et\n" +
					"[accedere](http://www.huc.io/) et via sideribus quem abit vitulus. Membra hic\n" +
					"vincere voto; pertulit aris; iam [quis](http://www.sonumvolans.io/non) deos in\n" +
					"*comae* oculisque.\n" +
					"\n" +
					"## Negarunt unda tergo contendisse habent felix Sabinae\n" +
					"\n" +
					"Oravere hunc. Mors ora dedit primumque tantoque formosus *pontus*! Cumque\n" +
					"Telamoniades populo urgeturque Pergama secum et regina deriguitque, premis\n" +
					"postibus regis. Refers inquit fuga requirere hoc par remansit ambitiosa per\n" +
					"chlamydis tamen vocat lunae, interrita. Hoc intra [ex antiqua\n" +
					"superstes](http://erat.com/liber).\n" +
					"\n" +
					"Memnonis calorque circulus in nova, Minos subii, cumque oppositumque! Omnia\n" +
					"prolisque causam fiducia, esse pugnat secura, illa fatalem: alto. Cruor tegendas\n" +
					"sine ventris **omnia opibusque** habet citharaque, puerilibus dedit, temperat e.\n" +
					"Solio visum pascua volucrumque venere solet rogus pars est vidisset per. Monet\n" +
					"abdiderat gladio nec rapida, quam quod; animo fratrique!\n" +
					"\n" +
					"Intervenit flagrant inmensum, procul: et Perseu, es caede pollice negata dum"));
        };
    }
}
