package fe.tldlib.__tld_gen

import fe.tldlib.ITldNode
import fe.tldlib.TldNode
import fe.tldlib.LeavesTldNode
import fe.tldlib.TldBase

internal class O_p_tlds : TldBase {
    override fun getTlds(): Map<String, ITldNode> {
        return mapOf(
            "pa" to LeavesTldNode("ac", "gob", "com", "org", "sld", "edu", "net", "ing", "abo", "med", "nom"),
            "pe" to LeavesTldNode("edu", "gob", "nom", "mil", "org", "com", "net"),
            "pf" to LeavesTldNode("com", "org", "edu"),
            TldNode.childless("pg"),
            "ph" to LeavesTldNode("com", "net", "org", "gov", "edu", "ngo", "mil", "i"),
            "pk" to LeavesTldNode(
                "com",
                "net",
                "edu",
                "org",
                "fam",
                "biz",
                "web",
                "gov",
                "gob",
                "gok",
                "gon",
                "gop",
                "gos",
                "info"
            ),
            "pl" to TldNode(
                TldNode.childless("com"),
                TldNode.childless("net"),
                TldNode.childless("org"),
                TldNode.childless("aid"),
                TldNode.childless("agro"),
                TldNode.childless("atm"),
                TldNode.childless("auto"),
                TldNode.childless("biz"),
                TldNode.childless("edu"),
                TldNode.childless("gmina"),
                TldNode.childless("gsm"),
                TldNode.childless("info"),
                TldNode.childless("mail"),
                TldNode.childless("miasta"),
                TldNode.childless("media"),
                TldNode.childless("mil"),
                TldNode.childless("nieruchomosci"),
                TldNode.childless("nom"),
                TldNode.childless("pc"),
                TldNode.childless("powiat"),
                TldNode.childless("priv"),
                TldNode.childless("realestate"),
                TldNode.childless("rel"),
                TldNode.childless("sex"),
                TldNode.childless("shop"),
                TldNode.childless("sklep"),
                TldNode.childless("sos"),
                TldNode.childless("szkola"),
                TldNode.childless("targi"),
                TldNode.childless("tm"),
                TldNode.childless("tourism"),
                TldNode.childless("travel"),
                TldNode.childless("turystyka"),
                "gov" to LeavesTldNode(
                    "ap",
                    "griw",
                    "ic",
                    "is",
                    "kmpsp",
                    "konsulat",
                    "kppsp",
                    "kwp",
                    "kwpsp",
                    "mup",
                    "mw",
                    "oia",
                    "oirm",
                    "oke",
                    "oow",
                    "oschr",
                    "oum",
                    "pa",
                    "pinb",
                    "piw",
                    "po",
                    "pr",
                    "psp",
                    "psse",
                    "pup",
                    "rzgw",
                    "sa",
                    "sdn",
                    "sko",
                    "so",
                    "sr",
                    "starostwo",
                    "ug",
                    "ugim",
                    "um",
                    "umig",
                    "upow",
                    "uppo",
                    "us",
                    "uw",
                    "uzs",
                    "wif",
                    "wiih",
                    "winb",
                    "wios",
                    "witd",
                    "wiw",
                    "wkz",
                    "wsa",
                    "wskr",
                    "wsse",
                    "wuoz",
                    "wzmiuw",
                    "zp",
                    "zpisdn"
                ),
                TldNode.childless("augustow"),
                TldNode.childless("babia-gora"),
                TldNode.childless("bedzin"),
                TldNode.childless("beskidy"),
                TldNode.childless("bialowieza"),
                TldNode.childless("bialystok"),
                TldNode.childless("bielawa"),
                TldNode.childless("bieszczady"),
                TldNode.childless("boleslawiec"),
                TldNode.childless("bydgoszcz"),
                TldNode.childless("bytom"),
                TldNode.childless("cieszyn"),
                TldNode.childless("czeladz"),
                TldNode.childless("czest"),
                TldNode.childless("dlugoleka"),
                TldNode.childless("elblag"),
                TldNode.childless("elk"),
                TldNode.childless("glogow"),
                TldNode.childless("gniezno"),
                TldNode.childless("gorlice"),
                TldNode.childless("grajewo"),
                TldNode.childless("ilawa"),
                TldNode.childless("jaworzno"),
                TldNode.childless("jelenia-gora"),
                TldNode.childless("jgora"),
                TldNode.childless("kalisz"),
                TldNode.childless("kazimierz-dolny"),
                TldNode.childless("karpacz"),
                TldNode.childless("kartuzy"),
                TldNode.childless("kaszuby"),
                TldNode.childless("katowice"),
                TldNode.childless("kepno"),
                TldNode.childless("ketrzyn"),
                TldNode.childless("klodzko"),
                TldNode.childless("kobierzyce"),
                TldNode.childless("kolobrzeg"),
                TldNode.childless("konin"),
                TldNode.childless("konskowola"),
                TldNode.childless("kutno"),
                TldNode.childless("lapy"),
                TldNode.childless("lebork"),
                TldNode.childless("legnica"),
                TldNode.childless("lezajsk"),
                TldNode.childless("limanowa"),
                TldNode.childless("lomza"),
                TldNode.childless("lowicz"),
                TldNode.childless("lubin"),
                TldNode.childless("lukow"),
                TldNode.childless("malbork"),
                TldNode.childless("malopolska"),
                TldNode.childless("mazowsze"),
                TldNode.childless("mazury"),
                TldNode.childless("mielec"),
                TldNode.childless("mielno"),
                TldNode.childless("mragowo"),
                TldNode.childless("naklo"),
                TldNode.childless("nowaruda"),
                TldNode.childless("nysa"),
                TldNode.childless("olawa"),
                TldNode.childless("olecko"),
                TldNode.childless("olkusz"),
                TldNode.childless("olsztyn"),
                TldNode.childless("opoczno"),
                TldNode.childless("opole"),
                TldNode.childless("ostroda"),
                TldNode.childless("ostroleka"),
                TldNode.childless("ostrowiec"),
                TldNode.childless("ostrowwlkp"),
                TldNode.childless("pila"),
                TldNode.childless("pisz"),
                TldNode.childless("podhale"),
                TldNode.childless("podlasie"),
                TldNode.childless("polkowice"),
                TldNode.childless("pomorze"),
                TldNode.childless("pomorskie"),
                TldNode.childless("prochowice"),
                TldNode.childless("pruszkow"),
                TldNode.childless("przeworsk"),
                TldNode.childless("pulawy"),
                TldNode.childless("radom"),
                TldNode.childless("rawa-maz"),
                TldNode.childless("rybnik"),
                TldNode.childless("rzeszow"),
                TldNode.childless("sanok"),
                TldNode.childless("sejny"),
                TldNode.childless("slask"),
                TldNode.childless("slupsk"),
                TldNode.childless("sosnowiec"),
                TldNode.childless("stalowa-wola"),
                TldNode.childless("skoczow"),
                TldNode.childless("starachowice"),
                TldNode.childless("stargard"),
                TldNode.childless("suwalki"),
                TldNode.childless("swidnica"),
                TldNode.childless("swiebodzin"),
                TldNode.childless("swinoujscie"),
                TldNode.childless("szczecin"),
                TldNode.childless("szczytno"),
                TldNode.childless("tarnobrzeg"),
                TldNode.childless("tgory"),
                TldNode.childless("turek"),
                TldNode.childless("tychy"),
                TldNode.childless("ustka"),
                TldNode.childless("walbrzych"),
                TldNode.childless("warmia"),
                TldNode.childless("warszawa"),
                TldNode.childless("waw"),
                TldNode.childless("wegrow"),
                TldNode.childless("wielun"),
                TldNode.childless("wlocl"),
                TldNode.childless("wloclawek"),
                TldNode.childless("wodzislaw"),
                TldNode.childless("wolomin"),
                TldNode.childless("wroclaw"),
                TldNode.childless("zachpomor"),
                TldNode.childless("zagan"),
                TldNode.childless("zarow"),
                TldNode.childless("zgora"),
                TldNode.childless("zgorzelec")
            ),
            TldNode.childless("pm"),
            "pn" to LeavesTldNode("gov", "co", "org", "edu", "net"),
            TldNode.childless("post"),
            "pr" to LeavesTldNode(
                "com",
                "net",
                "org",
                "gov",
                "edu",
                "isla",
                "pro",
                "biz",
                "info",
                "name",
                "est",
                "prof",
                "ac"
            ),
            "pro" to LeavesTldNode("aaa", "aca", "acct", "avocat", "bar", "cpa", "eng", "jur", "law", "med", "recht"),
            "ps" to LeavesTldNode("edu", "gov", "sec", "plo", "com", "org", "net"),
            "pt" to LeavesTldNode("net", "gov", "org", "edu", "int", "publ", "com", "nome"),
            "pw" to LeavesTldNode("co", "ne", "or", "ed", "go", "belau"),
            "py" to LeavesTldNode("com", "coop", "edu", "gov", "mil", "net", "org"),
            TldNode.childless("page"),
            TldNode.childless("panasonic"),
            TldNode.childless("paris"),
            TldNode.childless("pars"),
            TldNode.childless("partners"),
            TldNode.childless("parts"),
            TldNode.childless("party"),
            TldNode.childless("pay"),
            TldNode.childless("pccw"),
            TldNode.childless("pet"),
            TldNode.childless("pfizer"),
            TldNode.childless("pharmacy"),
            TldNode.childless("phd"),
            TldNode.childless("philips"),
            TldNode.childless("phone"),
            TldNode.childless("photo"),
            TldNode.childless("photography"),
            TldNode.childless("photos"),
            TldNode.childless("physio"),
            TldNode.childless("pics"),
            TldNode.childless("pictet"),
            TldNode.childless("pictures"),
            TldNode.childless("pid"),
            TldNode.childless("pin"),
            TldNode.childless("ping"),
            TldNode.childless("pink"),
            TldNode.childless("pioneer"),
            TldNode.childless("pizza"),
            TldNode.childless("place"),
            TldNode.childless("play"),
            TldNode.childless("playstation"),
            TldNode.childless("plumbing"),
            TldNode.childless("plus"),
            TldNode.childless("pnc"),
            TldNode.childless("pohl"),
            TldNode.childless("poker"),
            TldNode.childless("politie"),
            TldNode.childless("porn"),
            TldNode.childless("pramerica"),
            TldNode.childless("praxi"),
            TldNode.childless("press"),
            TldNode.childless("prime"),
            TldNode.childless("prod"),
            TldNode.childless("productions"),
            TldNode.childless("prof"),
            TldNode.childless("progressive"),
            TldNode.childless("promo"),
            TldNode.childless("properties"),
            TldNode.childless("property"),
            TldNode.childless("protection"),
            TldNode.childless("pru"),
            TldNode.childless("prudential"),
            TldNode.childless("pub"),
            TldNode.childless("pwc")
        )
    }
}
