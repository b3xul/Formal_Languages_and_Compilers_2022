
%%

%standalone
%class URL
%unicode

/* Single characters */
//JflexOperators = [" \ [ ] ^ - ? . * + | ( ) $ / { } % < > ~]
nl		=  \n|\r|\r\n
alpha = [a-zA-Z]
digit   = [0-9]
hexLetter = [a-fA-F]
pathLetters = [^\/\\:\*\?\"\-\>\|\n\r\t0-9]
/* hex=0-9a-f */
// 00-99
// 0A-9F
// A0-F9
// AA-FF
hex = ({digit}|{hexLetter})
 
/* URI RFC! https://datatracker.ietf.org/doc/html/rfc3986 */
//unreserved =  {alpha}|{digit}|\-|\.|_|\~
//genericDelimiters  = ":" | "|" | "?" | "#" | "[" | "]" | "@"
//subcomponentsDelimiters  = "!" | "$" | "&" | "'" | "(" | ")" | "*" | "+" | "," | ";" | "="
//reserved    = {genericDelimiters}|{subcomponentsDelimiters}


/* URL components */
//https://www.iana.org/assignments/uri-schemes/uri-schemes.xhtml
scheme  = aaa|aaas|about|acap|acct|acd|acr|adiumxtra|adt|afp|afs|aim|amss|android|appdata|apt|ar|ark|attachment|aw|barion|beshare|bitcoin|bitcoincash|blob|bolo|browserext|cabal|calculator|callto|cap|cast|casts|chrome|chrome-extension|cid|coap|coap+tcp|coap+ws|coaps|coaps+tcp|coaps+ws|com-eventbrite-attendee|content|content-type|crid|cvs|dab|dat|data|dav|diaspora|dict|did|dis|dlna-playcontainer|dlna-playsingle|dns|dntp|doi|dpp|drm|drop|dtmi|dtn|dvb|dvx|dweb|ed2k|elsi|embedded|ens|ethereum|example|facetime|fax|feed|feedready|fido|file|filesystem|finger|first-run-pen-experience|fish|fm|ftp|fuchsia-pkg|geo|gg|git|gizmoproject|go|gopher|graph|gtalk|h323|ham|hcap|hcp|http|https|hxxp|hxxps|hydrazone|hyper|iax|icap|icon|im|imap|info|iotdisco|ipfs|ipn|ipns|ipp|ipps|irc|irc6|ircs|iris|iris.beep|iris.lwz|iris.xpc|iris.xpcs|isostore|itms|jabber|jar|jms|keyparc|lastfm|lbry|ldap|ldaps|leaptofrogans|lorawan|lvlt|magnet|mailserver|mailto|maps|market|matrix|message|microsoft.windows.camera|microsoft.windows.camera.multipicker|microsoft.windows.camera.picker|mid|mms|modem|mongodb|moz|ms-access|ms-appinstaller|ms-browser-extension|ms-calculator|ms-drive-to|ms-enrollment|ms-excel|ms-eyecontrolspeech|ms-gamebarservices|ms-gamingoverlay|ms-getoffice|ms-help|ms-infopath|ms-inputapp|ms-lockscreencomponent-config|ms-media-stream-id|ms-meetnow|ms-mixedrealitycapture|ms-mobileplans|ms-officeapp|ms-people|ms-project|ms-powerpoint|ms-publisher|ms-restoretabcompanion|ms-screenclip|ms-screensketch|ms-search|ms-search-repair|ms-secondary-screen-controller|ms-secondary-screen-setup|ms-settings|ms-settings-airplanemode|ms-settings-bluetooth|ms-settings-camera|ms-settings-cellular|ms-settings-cloudstorage|ms-settings-connectabledevices|ms-settings-displays-topology|ms-settings-emailandaccounts|ms-settings-language|ms-settings-location|ms-settings-lock|ms-settings-nfctransactions|ms-settings-notifications|ms-settings-power|ms-settings-privacy|ms-settings-proximity|ms-settings-screenrotation|ms-settings-wifi|ms-settings-workplace|ms-spd|ms-stickers|ms-sttoverlay|ms-transit-to|ms-useractivityset|ms-virtualtouchpad|ms-visio|ms-walk-to|ms-whiteboard|ms-whiteboard-cmd|ms-word|msnim|msrp|msrps|mss|mt|mtqp|mumble|mupdate|mvn|news|nfs|ni|nih|nntp|notes|num|ocf|oid|onenote|onenote-cmd|opaquelocktoken|openpgp4fpr|otpauth|pack|palm|paparazzi|payment|payto|pkcs11|platform|pop|pres|prospero|proxy|pwid|psyc|pttp|qb|query|quic-transport|redis|rediss|reload|res|resource|rmi|rsync|rtmfp|rtmp|rtsp|rtsps|rtspu|sarif|secondlife|secret-token|service|session|sftp|sgn|shc|shttp(OBSOLETE)|sieve|simpleledger|simplex|sip|sips|skype|smb|smp|sms|smtp|snews|snmp|soap.beep|soap.beeps|soldat|spiffe|spotify|ssb|ssh|steam|stun|stuns|submit|svn|swh|swid|swidpath|tag|teamspeak|tel|teliaeid|telnet|tftp|things|thismessage|tip|tn3270|tool|turn|turns|tv|udp|unreal|urn|ut2004|uuid-in-package|v-event|vemmi|ventrilo|ves|videotex|vnc|view-source|vscode|vscode-insiders|vsls|wais|wcr|webcal|wifi|wpid|ws|wss|wtai|wyciwyg|xcon|xcon-userid|xfire|xmlrpc.beep|xmlrpc.beeps|xmpp|xri|ymsgr|z39.50|z39.50r|z39.50s

/* octet=0-255 */
//0-9
//10-99
//100-199
//200-249
//250-255
octet = {digit}|([1-9]{digit})|(1{digit}{2})|(2[0-4]{digit})|(25[0-5])
ipv4 = {octet}\.{octet}\.{octet}\.{octet}

// URI RFC! https://datatracker.ietf.org/doc/html/rfc3986#section-3.2.2
/* The syntax rule for host is ambiguous because it does not completely
   distinguish between an IPv4address and a reg-name.  In order to
   disambiguate the syntax, we apply the "first-match-wins" algorithm:
   If host matches the rule for IPv4address, then it should be
   considered an IPv4 address literal and not a reg-name. */
   //domain = ({registeredName}|{ipv4}|{ipv6}) Not a{registeredName} {System.out.println("Registered name")}dded ipv6 yet


/* Many URL RFC!

//https://www.w3.org/Addressing/URL/url-spec.txt
//https://datatracker.ietf.org/doc/html/rfc1738#section-3.1
//host
//        The fully qualified domain name of a network host, or its IP
//        address as a set of four decimal digit groups separated by
//        ".". Fully qualified domain names take the form as described
//        in Section 3.5 of RFC 1034 [13] and Section 2.1 of RFC 1123
//        [5]: a sequence of domain labels separated by ".", each domain
//        label starting and ending with an alphanumerical character and
//        possibly also containing "-" characters. The rightmost domain
//        label will never start with a digit, though, which
//        syntactically distinguishes all domain names from the IP
//        addresses.

Wikipedia:
Hostnames are composed of a sequence of labels concatenated with dots. For example, "en.wikipedia.org" is a hostname. Each label must be from 1 to 63 characters long.[2] The entire hostname, including the delimiting dots, has a maximum of 253 ASCII characters.[3] AcTuAlLy  SHOULD handle host names of up to 255 characters (https://datatracker.ietf.org/doc/html/rfc1123#section-2.1)

The Internet standards (Request for Comments) for protocols specify that labels may contain only the ASCII letters a through z (in a case-insensitive manner), the digits 0 through 9, and the hyphen-minus character ('-'). The original specification of hostnames required that labels start with an alpha character, and not end with a hyphen.[4] However, a subsequent specification permitted hostname labels to start with digits.[5] Internationalized domain names are stored in the Domain Name System as ASCII strings using Punycode transcription.[6] */
label = ({alpha}|{digit}|\-){0,62}({alpha}|{digit})
topLevelDomain = ({alpha}|{digit})*{alpha}({alpha}|{digit})*
//63+1+63+1+63+1+63=255
hostname = {label}(\.{label}){0,2}{topLevelDomain}

//registeredName = ({percentEncoding}|{unreserved}|{subcomponentsDelimiters})*


// TO DISTINGUISH ipv4 from hostname now that hostnames can start with a digit, we need to refer to the top-level domain, which cannot be composed of all digits: However, a valid host name can never have the dotted-decimal form #.#.#.#, since at least the highest-level component label will be alphabetic. This means the top level domain name must be alphabetic, thus the fully qualified hostname can never be confused with an IPv4 address. This idea has been clarified by RFC 3696(https://www.rfc-editor.org/rfc/rfc3696#section-2) for DNS and changed to not all-numeric. Note the slight difference.
host = ({ipv4}|{hostname})
//host = ({ipv4}|{registeredName})  includes . and .firstLevel while the solution doesn't
// also includes the first /, while the solution doesn't'
//host= {registeredName}
//host={ipv4}

//A port number is a 16-bit unsigned integer, thus ranging from 0 to 65535. For TCP, port number 0 is reserved and cannot be used, while for UDP, the source port is optional and a value of zero means no port.
//port = {digit}+

//1-9
//10-99
//100-999
//1000-9999
//10000-59999
//60000-64999
//65000-65499
//65500-65529
//65530-65535
port = ([1-9]{digit}{0,3})|([1-5]{digit}{4})|(6[0-4]{digit}{3})|(65[0-4]{digit}{2})|(655[0-2]{digit})|(6553[0-5])
authority = {host}(:{port})?

//id      = ({percentEncoding}|{unreserved}|{subcomponentsDelimiters}|:|@)+
id = ({pathLetters}|{digit}|{percentEncoding})+
pathName= {id}
fileName= {id}
fileType= {id}
path = (\/{pathName})*{fileName}(\/|\.{fileType})

anchor = #{id}

percentEncoding = \%{hex}{2}
URL = {scheme}:\/\/{authority}{path}?({anchor})?

// firstlevel    = it|com|gov|edu|net|uk|fr|de|ne|jp|ch ?

%%
//{hex} {System.out.println("Hex:\t'"+ yytext() + "'");}
//{percentEncoding} {System.out.println("PercentEncoding:\t'"+ yytext() + "'");}
//{scheme} {System.out.println("Scheme:\t'"+ yytext() + "'");}
//{ipv4} {System.out.println("IPv4 Address:\t'"+ yytext() +"'");}
//{host} {System.out.println("Host:\t'"+ yytext()+"'");}
//{authority} {System.out.println("Authority:\t'"+ yytext() +"'");}
//{path} {System.out.println("Path:\t'"+ yytext() +"'");}
//{hostname} {System.out.println("Hostname:\t'"+ yytext() +"'");}
^{URL}$ {System.out.println("Url:\t'"+ yytext() + "'");}
^.+$ {System.out.println("Invalid Url:\t'"+ yytext() + "'");}

{nl}|" "|\t 	{;}
//.		{System.out.println("Unmatched character:\t'" + yytext()+"'");}
