package DBManagement;

import java.sql.SQLException;
import java.util.Random;

import common.CentroVaccinale;
import common.TipologiaCentro;

public class DBTester extends DBVaccinazioniManagement{

	private String[] nomi = {"cesio","venerando","amabile","zanilla","mercurio","ilia","sostine","lidovina","danillo","pacina","bertino","alderino","esilio","desdemona","speranzo","amarilda","carletta","riginaldo","aldovina","costabile","omelio","onofria","mafalda","tsvetan georgiev","floriana","finuzzo","niccola","fedio","odetta","ivio","casto","colomba","jennifer","finicola","piave","merano","viero","unica","armanda","aurora","oceano","raffaellino","adige","fertile","wero","eduilia","esuberanzio","albana","olanda","teresio","otero","raulino","michela anna","guadagno","aldemia","georgia","nita","teodorino","florinto","ottava","argante","adelino","geromino","mariadina","alferio","alpa","melino","egide","redemisto","clementino","rosina","brasile","lorentino","oscarina","elianora","tania","elviano","florentina","carlalberto","aldemara","ferardo","lanfranco","paride","remi","fredino","ghita","samantha","pippo","medardo","farnese","cipriano","rimes","mimo","fiordisaggio","fiordalise","germinal","laurita","righetto","frazino","meuccia","metauro","nardo","arcangelina","elmiro","marcello","querino","mimina","provino","nelia","ilide","fellina","sallustio","onelia","leocadio","ornelio","selvaggio","florinda","algerina","giovanrico","zefira","ordes","severiana","ottavina","benuccio","faostina","sperdina","giustiniana","sibillo","filoteo","conone","serena suzue","geo","opaldo","ovelio","isea","venusta","furimma","ottavio","silvestra","marsilia","raffaelo","consiglia","valchiria","pomponio","fabiolina","rovigo","lemmo","basileo","reni","misio","emerica","agato","probo","romanita","alderigo","lallo","libertina","napolina","rizzo","giandomenico","primillo","taziana","purifico","egeria","averio","bigio","natale","fabriele","agata","oldea","lorito","adonello","mirano","mirka","fiero","laureato","ildegarda","memmo","terzillo","renzi","raimo","ameriga","susanna","slavisa","idelio","algia","vea","cafiero","gesuela","nema","tanuccio","odetto","matelda","ernino","deodato","almiro","nera","speranzina","andrietto","ciso","sestilio","marfisia","isido","marc","erto","filodelfio","firmo","arames","laurisa","sabbatino","valerina","marlena","colombano","nieve","udina","orienta","clerio","fabiano","eustorgio","leopoldino","almerico","fermina","beppino","paradisa","vezio","oriene","marianita","zefirino","remaldo","venturino","biasino","ede","ulrica","emanuel","elidia","floris","saturnino","euclida","darmo","mimmino","isida","bovio","innocentina","andalusa","tacito","reziere","sisinnia","alvaro","odorinda","filadelfa","carina","sesta","lattanzio","gottardina","svevo","manilla","cleto","vigilia","ultimo","iolo","florino","artenice","modestino","felicia","reulo","alan","osvina","diodato","doralice","calliope","settembrina","toscanello","felia","clemen","oreana","ademina","marto","reginalda","driade","achiropita","monica","filomana","nobilina","porzia","norge","alduino","accursa","vanessa","berta","adalgisa","mazzini","armela","bortola","primiera","igino","lara","coronato","graziana","bindo","verginio","aloisa","febrizio","eusebia","floranda","niobe","affortunato","olina","dusolina","vannella","catella","lubiano","ioana","narul","baldasarre","ledina","ostlia","erpidio","cinzia","aurelio","feanna","asteria","marsina","nivardo","lice","benedino","italio","fiorilda","lodoletta","firmando","mariacasilde","eolo","porsenna","reto","filda","leonino","ferronia","fedelica","gianfrancesca","eustasio","orfea","romena","ciardo","adilia","fiorano","ferdinando","elvisia","zoila","salvatorica","amelio","jayangani","rosasco","ronzino","lucifero","uberta","cenzo","diomede","guicciardo","fiamma","goliardo","giammaria","domenica","romolino","rifredo","celeste","lella","arcibaldo","freida","reggio","eudilio","giosaffatte","flamminio","venceslao","crescenzio","novemia","fabiana","velmina","luigino sergio","orseolo","naomi","selvino","anabel","normanna","ilda","filindo","girardengo","udalrico","rico","criseide","caio","anella","fiorio","renzina","oliade","genoveffa","risvelio","basilea","andreano","malvina","tolmino","gondar","mariotto","ottelio","risiero","fiorigio","ugoberto","geronzo","idomeneo","flenia","daniella","timotea","fabbia","ado","florentino","macario","pace","elviana","mirco","dania","fenia","nicia","cristofora","ermella","fulcio","marilia","narcisa","marianella","aldezza","orifiamma","arpalice","ritardo","idalma","flena","liduina","basilico","odarda","ezechiella","cesira","lina","dolorina","marcuccia","arduino","stellina","marone","bassiano","archita","elbano","aspasia","aventina","dirceo","fidelfo","salvatorina","domenicantonio","esuperanzo","esperino","ziliante","noË","saule","giuseppina","sisinio","verino","gagliano","castore","azzurrino","marinuccio","quintillio","edvino","ruggeri","odorina","raimondo maria","dumas","delfino","nolano","marida","adermo","kizito","rocchetto","radamez","alcmena","oriade","onesino","cruciano","rambo","robusto","riccardino","vanina","agnesina","oderisi","fornarina","cleontino","argantina","flaminia","annettina","felicit‡","anto","diogene","laurenzia","tanja","aglaia","cita","pierangela","rolino","fenice","foscaro","micol","ermentrude","guidobaldo","idolina","eusepio","mughetto","doretta","addamiano","nearco","nuccia","iosto","protaso","leana","rotilio","polissena","waldino","gorino","christopher","iacopina","giampietro","marx","calista","carisio","malgorzata wieslawa","florangelo","grimaldo","gentile","parisino","rubes","reggina","otina","parisa","alvezio","gerio","alderano","attila","effisio","violanda","odeo","gabino","ermidio","erberto","lisinda","nullo","roberta","belardino","elviso","ormido","pietrantonio","lucantonio","melina","arnalda","nunziatina","bertoldo","toselli","carmelino","favorina","giovandamiano","fogliana","redento","faido","ferrarino","amodio","giulivo","maggiorino","lusitania","mafaldo","lidiana","eriberto","contardino","frasia","genuino","pascuccio","masaniello","amatuccio","neviano","macrina","taziano","gilla","rodolfina","odonella","giangaleazzo","frola","fanio","lerio","osilde","ermesina","violetto","osvada","amorina","zanina","oscherino","veronico","fiorangelo","palmerino","realda","ovilia","ofemia","maurino","archelao","savio","iride","rosamaria","orenzo","adelmina","gabriello","alderio","adelia","cabiria","antima","mentana","lisimaco","florideo","pazienza","ezzelino","adelfio","vituccio","cadmo","adelfina","gesumina","cireneo","catina","romes","nordina","aquila","zina","dino","otilde","giancarlo","giangaetano","febbronia","savino","saturnina","chiarina","edi","manina","ricciero","prima","ludovica","aduana","ranunzio","floridia","moretto","rento","vania","rone","oldano","leonildo","romana","nilde","adria","fiorige","reamo","oreano","orvieta","odero","cristo","obbes","nardina","effisia","baldino","aulo","perlino","fioraldo","nivea","ezzelina","aleardo","rienzo","agricolo","rainera","rodi","saula","erculiano","marsiglio","elfrido","basilissa","fulva","forestano","conina","laodice","arcangelo","tazia","lilia","remiro","giovannangela","anastasia","eritreo","ortemio","edilio","corsino","donatello","ciretta","clemens","amodeo","imeldo","divinangelo","iseo","gavino","ottaviano","parisina","olvina","trifone","giuffrido","menina","romanella","armentina","fiordino","finita","valdemara","berto","manilia","maila","sistino","anna","argenta","ermelinda","alderico","marthe","iva","demetria","lillina","sigisfrido","levantino","dinetto","giarrico","gennara","claudio giuseppe","idanna","gallo","rudio","elzeario","ombra","perseo","renunzio","angiolino","fulda","edmondo","terzilio","roboamo","mariano","concessina","principia","pinuccio","bensa","ulderica","polinice","durantino","leo","alidea","oves","antonia","cherubino","orildo","verdiana","orma","andreina","ivania","santuccio","eufrasio","amalfia","rena","florida","eurosia","orsolino","santolo","gilda","abaco","belisaria","fiorangela","realino","idina","margherito","fausta","ascenzo","odinea","fedilla","attilia","pilade","varno","fidaldo","tripolina","celinia","jader","dorio","adelmo","filomarino","wolfango","firmana","rosana","neo","massino","roliano","efisina","romania","biagino","prometeo","maggio","innocentino","basile","pupa","illia","buovo","illuminata","mino","io","noviglio","argentino","fidelma","barsanofio","mileda","niva","afra","celsa","saverina","melito","felisa","galileo","ricordano","elisio","rofino","fortunatina","amandina","fervida","olegario","gualberto","shah","fiordelisa","zelmo","palmira","argia","rigoletta","assalonne","ella","eglantina","aprilio","odorico","rubens","cirillo","ciardino","eurosio","elfride","pensiero","checchino","odiglia","adoranda","ferrarina","elda","elza","altomiro","piacentina","lorisa","roviglio","felide","ginetto","almira","zulino","rino","adelio","robleto","iliade","onelio","dima","nevio","giosafatto","malina","catalin augustin","florina","comincio","alfreda","florenzia","rossano","glorietta","redi","helga","fledia","generosa","consolo","ilvia","atene","adinolfo","pandolfo","navarro","gustavo","deonisio","rolandina","martire","ulissa","robertino","merinda","lazzarina","rosvindo","odoviglio","riposa","ivo","arduilio","liberino","figenia","neves","giaele","mimmo","frosina","ornelia","giordano","agnieszka ewa","jacopo","luce","cleante","galilea","algimiro","nicoletto","uggero","cleopatra","edmea","ireneo","nausicaa","costantina","bianco","wilia","rodio","celsina","cino","emmanuele","alideo","iside","glauco","gisulfo","migliorino","orsini","eride","lisandro","feranda","socrate","aduo","amulio","rituccio","doralba","signora","michelangelo","fioldisa","laurentina","flaviano","massenzio","igea","gilma","odovilia","emanuele","vilfredo","fidelmo","enrichetto","fortunia","aldero","soccorso","fiora","florimondo","dolorosa","fanciullo","amero","neno","menotti","diletto","clito","giuffrida","evangelino","quintiliano","pamela","ariosto","debora","alfieri","enzia","filomena","gheraldo","leonide","isola","mirra","clicerio","mirto","berenice","finuccio","bentivoglio","cardenio","fermilio","leonio","almerinda","clelio","ampelia","romeo","liberta","roxana","ortes","ervino","ovidio","cassiana","antimina","odeide","rutilio","cusumano","palmarosa","ondino","pelino","graziosuccio","concezione","marica","amatore","telmo","olvea","orizio","rodiano","asmaro","chiaretta","giuditto","gilbertina","khadijia","vitantonia","delio","olietta","manlio","telesforo","fede","gentilio","elisiana","artimina","otellia","euticchio","filippo","milano","ottino","fidea","neria","maghinardo","vara","dalino","lorenzino","crescentina","felsina","veronica","olmes","giobbe","alarico","marzio","cono","ivana","olindo","balduina","erilde","ulderico","fulgenzio","montagna","olis","ercolino","gennarino","cosmo","adelmira","ermeta","gioela","coralla","lisetta","filippino","foscarino","onis","mammola","loretta","oleno","aristodemo","isaura","arturo","lauretto","pedja","antonetto","osilide","guidina","giliberto","madio","zoella","floralba","clodomiro","mirte","argemiro","giovancarla","parigina","salvadore","nicodema","liso","allegra","acheropita","gennaia","ottone","brunetta","cornelio","gualtiero","waldemiro","gizio","edmeo","rotondo","mohamad","liseo","carminio","giliola","alcina","panfila","ferriero","feliciola","fidalmino","ardemaro","ivonio","ascenso","nicco","fulvia","menotto","flavietta","novenio","alfredino","leonido","gelmiro","ortenilla","aldimiro","anno","goito","galiano","cisa","trento","dolcissima","preziosa","canio","filinda","leonella","mondino","iones","zannetto","alberica","fenella","paolino","filea","baudolino","arminio","floredana","aica","narda","gilia","ontario","elvina","angelantonio","mentore","gregorio","ariola","spera","antonietto","persilia","tanina","cecilia","oceanio","giuleppe","cleofe","petra","isolina","quadrio","armida","balbina","mansueta","gianpaola","danio","ernestina","giannantonia","filadelfia","bonacata","varia","mirone","giangastone","rosildo","stefania","arialda","bernadetto","midio","oronte","torquato","radamisto","beltrando","wandina","onorino","giziano","reginetta","santillo","shah jahan","nisia","vilio","spartaca","onore","ewa elzbieta","enerio","nereo","alfa","ivona","giuliana","frasina","decia","martinella","proto","illeana","ferando","fines","dolorino","dariella","gemiliana","carminuccio","alfie navar","nejib ben moham","eglina","marchetto","emiddia","fiume","gero","bartolomeo","amarillide","odillo","lodovino","elino","zaccaria","ingenuino","iacopa","memË","uga","giseldo","fellino","weber","vladimira","elios","ionio","orielle","lietta","clara","oto","nicasio","confucio","martina","mirvano","moraldi","astra","vandina","palestina","tiberia","noradino","eneide","tona","elsia","simonetta","egeo","bernadetta","massimina","fantina","arcangiolo","ermengarda","fabbrizia","fiordispina","erenio","evanzio","giovacchina","silano","paoluccio","girolamo","wolfrano","lisa","erido","bambina","mariagrazia","gildo","otino","divina","adrasta","quartilia","edgardo","algeria","leopolda","elmerico","piermauro","addiego","annunziato","castruccio","eudemo","gallio","conchita","erinna","ferradino","oris","piero","amerinda","oster","olfeo","gioiello","oldo","graziano","orviano","mimi","foscolina","ava","resi","leoluchina","eura","favilla","tranquilla","gelsomino","girlando","auretta","alberigo","florana","angiolina","cateno","regina","melinda","nunziatella","viero","temi","miro","illidio","beltrame","venturina","pascasio","europa","feruccio","ermetina","fermano","cenzella","rugero","lidamo","sipontina","azad","primiana","miliano","mimosa","lugano","nabor","espero","euplio","fioradea","finalbo","giorlanda","parsifal","ercole","oise","orante","fanola","fleano","meno","leone","fraulina","lodovico","orfilia","oclerio","brandino","giulietto","alvarino","alceste","giorgina","nilio","crisostomo","gerardo","fifina","ezechiela","ligia camelia","alamiro","bonacattu","dimitrio","ivardo","lucidio","ahmed","abbondina","lyubima rosenava","getulia","fenello","gasparina","orelma","artemisia","dorita","quintiliana","levino","deanira","imperia","alfiere","nieves","dimo","finimonda","rkia","marisa","leido","fedele","fedrica","albertina","egiziaca","lucillo","alcea","celsio","alide","leondina","onidia","carmelio","macedonio","grazioso","coronata","magdalo","stefanio","dionira","finuzza","orazina","ginesio","turino","orsetta","ademo","fiorenda","remina","roseto","valtiero","onisto","galante","lellio","bianca","iello","renetto","paladina","desolina","ascenza","donizio","melchiorrina","asiago","orando","sivigliana","caruso","altavilla","myrta","perlo","volfrano","gemignano","amica","pompea","bastianina","battistina","demaro","lombardo","otelma","matildo","filumena","egea","ido","niccolino","marilla","lupo","edoardina","sarita","diva","antero","ottina","calvino","eutichio","gisberto","onesio","osca","oretto","collatino","almo","onerio","egiziano","libertaria","fortunella","eridana","orneglia","otellina","valteria","sotero","eraclita","osiria","creso","damasca","ilija","nevis","ageo","andreino","rebecca","ordelia","stamura","ivreo","nuto","zaved khan","matilde","palmiero","lucrezio","fabrino","niceo","sibilla","idiano","tersillo","cristofalo","irmo","olesia","fedorina","euripide","agape","carolina","regolino","epaminonda","taddea","casilde","amatrice","trinit‡","terziano","urio","gheorghe adrian","landuccio","ercolina","pompilia","pierantonio","fecondo","alfo","pawel rafal","crocina","assuntino","adua","pellico","irmina","tillo","luigia","castrenzio","flaviana","fulgida","dardo","mondo","ottilia","anco","sandra","signorello","filadelfo","aprile","enoc","lorenzo","adigrat","druso","silena","galantino","signorina","felinda","dalia","ofelda","biancaneve","gioella","ofemio","dimitri","pasquina","cristian","olisio","alcino","ermido","elvinia","ferminio","febo","ola","ermelina","fernando","illuminato","zaverio","donetta","felio","emma","flavianna","valdina","alindo","adeodata","aiace","castrenza","irina","eduarda","michela","artura","roman","roveno","onestino","assenzio","adelisio","fiorina","silvana","tomaso","nicanore","orizia","oliveta","mariettina","palamede","fiorillo","fortunello","luciano","india","orenzina","giovanfilippo","finetta","idelmina","foliero","remondino","ianna","aniceto","nillo","annarella","celidonio","faro","catia","finimolo","eloisa","ignazia","osema","omobuono","ermellino","amelino","alessandria","guerra","zilda","leonida","colombo","verter","fortina","pinella","federigo","settimino","quindalina","ariella","ostelvio","dera","romo","ermenegildo","willelmina","marialina","massimino","formenzio","primarosa","remedino","teseo","armerina","albanino","maria laura","fulviano","radislao","alpiniano","cristiana","iacobella","ughetta","odissea","fiordiligi","oleano","alcide","trentino","andreuccia","erasma","william","mirina","novarina","giunta","giuseppino","madina","riccieri","onilda","nelita","pieruccio","oriella","dorino","toto","shajahan","medino","adalberto","feride","camilla","fortunina","oranzo","norma","calimero","vittoriano","iginio","tesea","calcedonio","cleme","nado","ferrero","tore","orana","adalinda","maresa","antonillo","espedito","raffelina","poldina","prosdocimo","ambrogino","salverino","orsa","altabella","brunellesco","leonorio","olivino","daniela","romolina","alibrando","vinca","orsolina","vinicia","ringo","tommassino","oberto","marino","paulo","achilla","aduino","pellegro","odorino","ciriaca","artenio","millo","alcesta","elsa","israele","roseo","noemi","madia","anta","fernaldo","benedetta","affortunata","filodelfo","fioruccio","adrasto","gregoria","davida","alighiera","attiliano","delmo","vito","dorindo","finisio","adolfo","altieri","urbana","narcisio","cristofaro","zoraide","aurino","amantina","achille","attico","galdo","imma","zannetta","remilio","pantalea","geminio","noemia","eleano","diambra","lesbino","oroveso","milva","lazzero","domitilla","nea","giugliano","giberto","glorio","alidora","abele","orlana","raffaeluccio","radiano","margarita","lucino","fladimiro","sigismondo","vana","luca","eulalio","rogelio","remildo","flavia","renieri","ferruccio","romolo","uria","ferrera","donatuccio","laurenzo","venezia","altea","oriliano","teodoro","ottiglia","innocenta","giovenale","ulla","roccardo","ausilio","sabbatina","nilo","orentino","primo","terza","liano","arciso","deomira","enio","rosalba","rezzieri","marcuccio","gessica","sistilio","oronzina","agenore","silvero","dalinda","richelmo","olivia","moira","lubiana","clodia","erlindo","geromina","santarella","tomasino","nedina","scevola","wolframo","andreuccio","tiziano","italico","dorligo","eco","salomË","ravenna","giampiera","savoia","saturno","baldina","ademara","olinda","aladino","prisco","tosello","idea","libero","desidera","prudenza","gervasio","ubaldino","gianlorenzo","gemmino","orlinda","liliano","salvato","cornelia","veturio","diletta","amoroso","tito","brunaldino","oddino","pergentino","iafet","vita","sina","osetta","errigo","menenio","tazio","cecilio","osmanna","virgilia","feltro","adelca","norberto","cora","carmino","ermogene","ettora","almirante","ivaldo","evangelia","rossellina","verina","ademia","febronia","carmelina","marzia","palmierino","stefana","doloris","mirello","eccelso","orfina","isidoro","rinaldino","bernardino","apollonio","icilia","facondina","foschina","cassiano","notburga","verena","enrica","albo","iris","fillide","bibbiana","edma","luigi","serviglio","abrama","azaea","musetta","flauto","noris","semplicio","corrada","mirta","adelasio","floridante","ode","splendora","sigilfredo","gioiosa","castrenze","romualda","senofonte","lando","ligio","minnia","filargino","decenzio","aimo","zelinda","franceschina","omnia","agnieszka irena","denis","trusiana","beniamino","selma","giosuË","saria","laerte","arienzo","emo","orielda","era","adelcisa","eudemia","marcolino","alviso","mazzeo","puccio","aristotile","valchirio","eddo","angela","fiducia","nemorino","quartilio","clario","fioretto","montello","antigona","pilar","ardito","gigliolo","oscarre","riger","redo","alduina","evelio","romina","fermana","gianetto","emmelina","zelindo","amarilli","gualterio","oseo","olivetta","ermolao","elvea","arnolfo","antonilla","adele","altero","tobiolo","armella","orientino","filino","fiordimaria","pietruccia","alessandrino","senad","dalio","ercola","deledda","didio","gontrano","marietto","zeferino","gaetanino"};
	private String[] cognomi = {"ranucci","de florio","d'agapito","urbini","Serra","lopez","bassano","linzi","cicconi","Romano","de cataldo","severi","lelli","delgado","canichella","infante","farazi","luzietti","sorrentino","lucani","sorbalo","bellettini","Fiore","Agostini","casali","de stefano","mohammed","battelli","dallago","Farina","marchesini","tarozzi","romano","Marchi","Martini","Piccolo","harasymiuk","laurenti","Lorusso","gigante","scipioni","barruga","panchetti","Ricciardi","wirth","Barone","bencivenga","labella","trasforini","tufano","guida","balice","graffiedi","bassolino","nini","valvano","caccamo","salamone ","caligiuri","policarpo","rainesi","salvini","taurone","jagmin","Giuliani","jianu","tarani","marata","Marino","De Rosa","mirante","nuti","alpi","Rinaldi","vandenbulcke","Guerra","coluccia","antosh","ciarla","","planta","Basile","de freitas sousa tavares","Ferrara","gutjahr","Rossetti","parini","tronconi","mane","fiadone ","Bruno","niane","lazar","Fumagalli","Ferretti","albanese","moschetti","carpi marasco","guaman","lanzoni","donati","zivkovic","kovacs","Neri","piga","Castelli","cecchetti","eichenberger","fossaroli","settembrini","sgrigna","satta","zapalski","de simone","sposato","attendoli","milenov","martellini ","tarnogrodzki","santana moscato","Riva","bianchi","fico","laita","Antonelli","Piras","Moretti","Silvestri","grossi pavia","sorgentone","Costantini","esposito","alam","Pellegrini","mauro","bonomo","russo","tranquilli","caporilli","minuz","dotti","tosolini","arlati","Pinna","rosati","castaldi","sipio","spoletini","Morelli","vitor","Martino","monsorno","minestrini ","rossi","gentili","mollica","mucci","zavalloni","vassura","montuori","Santoro","fiumi","pascale","blasi","Meloni","pracucci","Monaco","Calabrese","odigwe","moiano","dorascenzi","cerchierini","gentilini","filippi","anklin","pulsoni","pal ionut","andruccioli","patruno","corrado","cannizzaro","Arena","bragioto","galotti","renzulli","Albanese","galli","alfano","ricci","Pellegrino","Benedetti","Sanna","coulier","urzo","curcio","Longo","fiordigigli","filippelli","bellino","castagna","paglia","focaccia","vaccaro","bushulli","Ferrero","rosato","Grasso","rocchi","chesti","spalletta","domenicali","Marini","zavoli","wicher","colonna","zanellati","marchi","oliva","bentivegna","fusini","bartolucci","caniglia ","siapian","andronico","Ruggiero","vinciguerra","mattioni","cospito","paul","charaf","Franco","giuliani","Rizzo","siracusa","riboloni","Montanari","comini","lattanzi","Coppola","di santo","mariani","Valentini","marocchini","magalotti","capone ","lucarini","el hallaf","di mario","baldinotti","zak","Valente","harroud","patwary","cardinetti","benhadda","gubinelli","campana","totaro ","lippi","stefanovich","Greco","iuliano","abu","burla","veneziani","bennada epse herichi","polidori","baragliu","robbio","capelli","lena","di lena","zolnowski","fontanella","ghazi","Bellini","gatti","wilmer","Ferri","Grimaldi","Marra","muratori","pierucci ","coluccio","cipollone","bonn","karim","rotella","bagnaia","Palumbo","nizzi","colli","haji","caraballo","ciervo","poni","tiglio","di benimeo","acunzo","campanella","renzoni","Baldi","De Simone","cichon","Donati","costa","soldati","emumwen","scardone","kellmann","pelo","latini","grebenea","williams","sementilli","delgadillo vargas","Battaglia","borkowska","sala","massa","Conte","gealapu","Giorgi","tomassi","palatano","parravani","porta","paradisi","Esposito","croce","diacetti","Proietti","Di Stefano","coccia","Pozzi","toader","caldironi","popescu","fratini","moukrim","wenz","rizzelli","cheikh talibouya","martys","monsone ","mane'","ferrarese","liberto ","Orlando","pia","ciarlariello","di sipio","popovici","Santini","rudel","diamantini","guillen crespo","bento da silva","di carlo","boschi","resende azevedo","iacoangeli","scarale","salvemini","pereira de castro","d'achille","cusin","medda","Pagano","piersanti","el haqaoui","tioni","carullo","disabato","bassani","raqabi","teodorani","cauteruccio","zaccaria","bonventre","gagliardi","pisacane","Volpe","cenciarelli","tisba","caligari","malagigi","tabane","fraticelli","ducci","errichetti","Fusco","Gentile","scotti","di pasquale","la sorda","manchia","avello","crognale","nurul","giorgetti","buongrazio","sebastiani","mahu","minnella","maldini","de filippis","lunerti","Aiello","pompili","Mele","trombino","de la cruz","blasi ","lanconelli","Rizzi","cavaterra","Villa","Bianco","avendato","fortini","bernacci","di ruzza","polyzopoulos","deiana","di menna","apa","fassbender","bonsignore","mathlouthi","pezzuco","casella","Grassi","Gallo","castagnoli","bardi","piccoli","zanella","Lombardi","Testa","iachini","iatalese","Brambilla","strazzanti","napoli","aguila","bertini","crepaldi","vannozzi","huaman lopez","balta","michilli","Napolitano","bellinzoni","Cirillo","stefoni","Monti","porcu","giannetti","quartarone","rosata","passitto","el kaaba  armit","ahmed el ghandor","Ferrante","bruni","filagna","orlandi","piani","borrelli","bernardi","masetti","rifilato","Mariani","carucci","hijjoui","zenina","luzzi","hossain","basile","santucci","Perrone","sbreni","zeolla","ricciolino","mussinelli","zandoli","zurzolo","mezzogori","hajji","guzman soriano","Bianchi","vella","Sala","tambini","piacentini","Amato","zolea","iacobelli","usami","simonetti","de domenico ","colongi","d'alessandro","soro","kamal","petritoli","Bruni","palma ","seri","Zanetti","Gatti","fontana","Fabbri","pasquini","speziale","cerilli","ceraldi","armaroli","Russo","filipek","guidi","fazi","pello'","assal","Galli","rucci","leonetti","zamberlan","emili","quadalti noferini","adorno","azzarri","Ferro","clementucci","De Santis","mangano","pozzi","buccolieri","saccone","Romeo","jaschke ","Leone","de matteo","cozzolino","zinnamosca","minelli","Ceccarelli","romani bergonzo","de bacco","abbondanza","Barbieri","lacerenza","sanges","Pastore","Martinelli","Ferraro","fabiani","borghini","turci","finiti","botnariu","mena","Sartori","di renna","cutillo","costantini","accadia","bartolini","sassi","chiricozzi","ranfi","mincuzzi","vidanalage","Pace","bugli","del aguila rosario","Caputo","brizi","tazzari","Olivieri","Milani","d'emilia","Ruggeri","rebeccato","metozzi","pascucci","jebrane","bellaneve","castaldo","wozniak","paduano","serban","ercolani","bazhanova","toso","panichi","ruggieri","placidi ","capanna","boes","manzi","gromala","Rossi","antonelli","casadei","sanna","pongetti","Marchetti","carina","valbonesi","bevilacqua","simoni","bello","Lombardo","ianne","Mancini","montevecchi","vincenzi","d'amore","veneziano","milutinovic","Gargiulo","apreda","cataldi","lecca","fasano","cecere","Palmieri","meucci","villa","lazazzera","Pepe","ferrari","Ricci","giurgola","romagnoli ","sartori","callegarini","piro","barone","barsanti","conte","Poli","gori","martino","De Angelis","grande","panza","tulli","steffenoni","berardi","gnani","d'ambrosio","amato","giorgio","Catalano","baiano","giura","gindre","lucchi","de santis","contiu","donnhauser","angelicchio","capitani","zepponi","gamberini","forcina ","di maio","morselli","Villani","kosek","el falaki","boncompagni","Vitali","covato","potalivo ","fiuzzi","chaibi","Garofalo","zuccherelli","verastegui pereyra","Costa","valdinosi","colombo ","brunetti","di tuoro ","pasolini","pinna","errahmani","dolciotti","di paolo","balloni","sarpieri","Cavallo","naci","zanelli","biondini","carrara","baronti","Piazza","boubaker","Fontana","Guidi","taifi","bagnato","narducci","ermeti","Mazza","morsiani","freschi ","ghini","Cattaneo","angiuli","conflitti","Messina","zito","nicastro","papaleo","mamone","Giordano","Conti","mercantini","cellini","bazzocchi","quadrini","olivelli","pucciotti","clesceri","pacini","zaratti","vanni","von oppen","forcina","ossati","donatini","cangini","stazzone","Moro","fadda","fontanilla","de sterlich","pierucci","di marco","lucchesini","cagnotti","Carbone","Ferrari","donatantonio","ciampaglia","hushchyna","celotti","ortu","corrias","mugione","Parisi","maroncelli","Caruso","borgat-wohlbang","Colombo","sestito","d'amora","terracciano","pelliccia","succi","mascali zeo","marano","fabbrizi","baldari","Bernardi","la bella","Sorrentino","wally","torraca","d'amico","sasvari","kazi","paolini","ceccaroni","frasca","wozniczka","zecchini","colle","haryadi","Vitale","De Luca","gasmi","ahamed","lesniewska","dottavio ","tiranno","palazzari","sassetti"};
	private String[] sigle_province = {"AG","AL","AN","AO","AR","AP","AT","AV","BA","BT","BL","BN","BG","BI","BO","BZ","BS","BR","CA","CL","CB","CI","CE","CT","CZ","CH","CO","CS","CR","KR","CN","EN","FM","FE","FI","FG","FC","FR","GE","GO","GR","IM","IS","SP","AQ","LT","LE","LC","LI","LO","LU","MC","MN","MS","MT","ME","MI","MO","MB","NA","NO","NU","OT","OR","PD","PA","PR","PV","PG","PU","PE","PC","PI","PT","PN","PZ","PO","RG","RA","RC","RE","RI","RN","RM","RO","SA","VS","SS","SV","SI","SR","SO","TA","TE","TR","TO","OG","TP","TN","TV","TS","UD","VA","VE","VB","VC","VR","VV","VI","VT"};
	private String[] province = {"Agrigento","Alessandria","Ancona","Aosta","Arezzo","Ascoli Piceno","Asti","Avellino","Bari","Barletta-Andria-Trani","Belluno","Benevento","Bergamo","Biella","Bologna","Bolzano","Brescia","Brindisi","Cagliari","Caltanissetta","Campobasso","Carbonia-Iglesias","Caserta","Catania","Catanzaro","Chieti","Como","Cosenza","Cremona","Crotone","Cuneo","Enna","Fermo","Ferrara","Firenze","Foggia","Forlì-Cesena","Frosinone","Genova","Gorizia","Grosseto","Imperia","Isernia","La Spezia","L'Aquila","Latina","Lecce","Lecco","Livorno","Lodi","Lucca","Macerata","Mantova","Massa-Carrara","Matera","Messina","Milano","Modena","Monza e della Brianza","Napoli","Novara","Nuoro","Olbia-Tempio","Oristano","Padova","Palermo","Parma","Pavia","Perugia","Pesaro e Urbino","Pescara","Piacenza","Pisa","Pistoia","Pordenone","Potenza","Prato","Ragusa","Ravenna","Reggio Calabria","Reggio Emilia","Rieti","Rimini","Roma","Rovigo","Salerno","Medio Campidano","Sassari","Savona","Siena","Siracusa","Sondrio","Taranto","Teramo","Terni","Torino","Ogliastra","Trapani","Trento","Treviso","Trieste","Udine","Varese","Venezia","Verbano-Cusio-Ossola","Vercelli","Verona","Vibo Valentia","Vicenza","Viterbo"};
	private Random randInt;
	
	public DBTester() throws SQLException {
		super();
	}
	
	public void testRegistraCentroVaccinale(){
		randInt = new Random();
		String[] centri = {"Pala","Centro","Campo"};
		String[] scuole = {"Scuola Elementare","Scuola Media","Scuola Superiore"};
	
		String[] colori = {"Verde","Blu","Rosso","Bianco","Azzurro"};
		
		String centro = centri[randInt.nextInt(centri.length)];
		if(randInt.nextInt(2) == 0)
			centro += " "+cognomi[randInt.nextInt(cognomi.length)];
		else
			centro += " "+colori[randInt.nextInt(colori.length)];
		
		if(randInt.nextInt(2) == 0)
			centro = scuole[randInt.nextInt(centri.length)]+" "+nomi[randInt.nextInt(nomi.length)]+" "+cognomi[randInt.nextInt(cognomi.length)];
		
		String[] ql = {"via","viale","piazza"};
		String nome = "";
		int civ = randInt.nextInt(999);
		int cap = randInt.nextInt(30000)+10000;
		String comune = province[randInt.nextInt(province.length)];

		if(randInt.nextInt(2) == 0)
			nome = nomi[randInt.nextInt(nomi.length)]+" "+cognomi[randInt.nextInt(cognomi.length)];
		else
			nome = cognomi[randInt.nextInt(cognomi.length)]; 
		String prov = sigle_province[randInt.nextInt(sigle_province.length)];
		
		String indirizzo = ql[randInt.nextInt(ql.length)]+" "+nome+";"+civ+";"+comune+";"+prov+";"+cap;
		
		TipologiaCentro[] tipologia = TipologiaCentro.values();
		TipologiaCentro t = tipologia[randInt.nextInt(tipologia.length)];
		
		CentroVaccinale C = new CentroVaccinale(centro,indirizzo,t.toString());
		try {
			registraCentroVaccinale(C);
		} catch (SQLException e) {
		}
	}
	
	public static void main(String[] args) {
		DBTester tester=null;
		try {
			tester = new DBTester();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<100;i++)
			tester.testRegistraCentroVaccinale();
	}

}
