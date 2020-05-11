package hellofx.fheroes2.agg;

import hellofx.fheroes2.serialize.FileUtils;

import java.util.HashMap;
import java.util.Map;

public class IcnKind {
    public static int UNKNOWN = 0;
    public static int ADVBORDE = 1;
    public static int ADVBORD = 2;
    public static int ADVBTNS = 3;
    public static int ADVEBTNS = 4;
    public static int ADVMCO = 5;
    public static int AELEM = 6;
    public static int APANBKGE = 7;
    public static int APANBKG = 8;
    public static int APANELE = 9;
    public static int APANEL = 10;
    public static int ARCHER2 = 11;
    public static int ARCHER = 12;
    public static int ARCH_MSL = 13;
    public static int ART32 = 14;
    public static int ARTFX = 15;
    public static int ARTIFACT = 16;
    public static int BARB32 = 17;
    public static int B_BFLG32 = 18;
    public static int BERZERK = 19;
    public static int B_FLAG32 = 20;
    public static int BIGBAR = 21;
    public static int BLDGXTRA = 22;
    public static int BLESS = 23;
    public static int BLIND = 24;
    public static int BLUEFIRE = 25;
    public static int BOAR = 26;
    public static int BOAT32 = 27;
    public static int BOATSHAD = 28;
    public static int BOATWIND = 29;
    public static int BOOK = 30;
    public static int BORDEDIT = 31;
    public static int BOULDER = 32;
    public static int BRCREST = 33;
    public static int BROTHERS = 34;
    public static int BTNBAUD = 35;
    public static int BTNCMPGN = 36;
    public static int BTNCOM = 37;
    public static int BTNDCCFG = 38;
    public static int BTNDC = 39;
    public static int BTNEMAIN = 40;
    public static int BTNENEW = 41;
    public static int BTNESIZE = 42;
    public static int BTNHOTST = 43;
    public static int BTNMCFG = 44;
    public static int BTNMODEM = 45;
    public static int BTNMP = 46;
    public static int BTNNET2 = 47;
    public static int BTNNET = 48;
    public static int BTNNEWGM = 49;
    public static int BTNSHNGL = 50;
    public static int BUILDING = 51;
    public static int BUYBUILD = 52;
    public static int BUYBUILE = 53;
    public static int CAMPBKGE = 54;
    public static int CAMPBKGG = 55;
    public static int CAMPXTRE = 56;
    public static int CAMPXTRG = 57;
    public static int CAPTCOVR = 58;
    public static int CASLBAR = 59;
    public static int CASLWIND = 60;
    public static int CASLXTRA = 61;
    public static int CASTBKGB = 62;
    public static int CASTBKGK = 63;
    public static int CASTBKGN = 64;
    public static int CASTBKGS = 65;
    public static int CASTBKGW = 66;
    public static int CASTBKGZ = 67;
    public static int CASTLEB = 68;
    public static int CASTLEK = 69;
    public static int CASTLEN = 70;
    public static int CASTLES = 71;
    public static int CASTLEW = 72;
    public static int CASTLEZ = 73;
    public static int CATAPULT = 74;
    public static int CAVALRYB = 75;
    public static int CAVALRYR = 76;
    public static int CBKGBEAC = 77;
    public static int CBKGCRCK = 78;
    public static int CBKGDIMT = 79;
    public static int CBKGDITR = 80;
    public static int CBKGDSRT = 81;
    public static int CBKGGRAV = 82;
    public static int CBKGGRMT = 83;
    public static int CBKGGRTR = 84;
    public static int CBKGLAVA = 85;
    public static int CBKGSNMT = 86;
    public static int CBKGSNTR = 87;
    public static int CBKGSWMP = 88;
    public static int CBKGWATR = 89;
    public static int CELLWIN = 90;
    public static int CENTAUR = 91;
    public static int CFLGSMAL = 92;
    public static int CLOP32 = 93;
    public static int CLOUDLUK = 94;
    public static int CMBTCAPB = 95;
    public static int CMBTCAPK = 96;
    public static int CMBTCAPN = 97;
    public static int CMBTCAPS = 98;
    public static int CMBTCAPW = 99;
    public static int CMBTCAPZ = 100;
    public static int CMBTFLE1 = 101;
    public static int CMBTFLE2 = 102;
    public static int CMBTFLE3 = 103;
    public static int CMBTHROB = 104;
    public static int CMBTHROK = 105;
    public static int CMBTHRON = 106;
    public static int CMBTHROS = 107;
    public static int CMBTHROW = 108;
    public static int CMBTHROZ = 109;
    public static int CMBTLOS1 = 110;
    public static int CMBTLOS2 = 111;
    public static int CMBTLOS3 = 112;
    public static int CMBTMISC = 113;
    public static int CMBTSURR = 114;
    public static int CMSECO = 115;
    public static int COBJ0000 = 116;
    public static int COBJ0001 = 117;
    public static int COBJ0002 = 118;
    public static int COBJ0003 = 119;
    public static int COBJ0004 = 120;
    public static int COBJ0005 = 121;
    public static int COBJ0006 = 122;
    public static int COBJ0007 = 123;
    public static int COBJ0008 = 124;
    public static int COBJ0009 = 125;
    public static int COBJ0010 = 126;
    public static int COBJ0011 = 127;
    public static int COBJ0012 = 128;
    public static int COBJ0013 = 129;
    public static int COBJ0014 = 130;
    public static int COBJ0015 = 131;
    public static int COBJ0016 = 132;
    public static int COBJ0017 = 133;
    public static int COBJ0018 = 134;
    public static int COBJ0019 = 135;
    public static int COBJ0020 = 136;
    public static int COBJ0021 = 137;
    public static int COBJ0022 = 138;
    public static int COBJ0023 = 139;
    public static int COBJ0024 = 140;
    public static int COBJ0025 = 141;
    public static int COBJ0026 = 142;
    public static int COBJ0027 = 143;
    public static int COBJ0028 = 144;
    public static int COBJ0029 = 145;
    public static int COBJ0030 = 146;
    public static int COBJ0031 = 147;
    public static int COLDRAY = 148;
    public static int COLDRING = 149;
    public static int CONGRATS = 150;
    public static int COVR0001 = 151;
    public static int COVR0002 = 152;
    public static int COVR0003 = 153;
    public static int COVR0004 = 154;
    public static int COVR0005 = 155;
    public static int COVR0006 = 156;
    public static int COVR0007 = 157;
    public static int COVR0008 = 158;
    public static int COVR0009 = 159;
    public static int COVR0010 = 160;
    public static int COVR0011 = 161;
    public static int COVR0012 = 162;
    public static int COVR0013 = 163;
    public static int COVR0014 = 164;
    public static int COVR0015 = 165;
    public static int COVR0016 = 166;
    public static int COVR0017 = 167;
    public static int COVR0018 = 168;
    public static int COVR0019 = 169;
    public static int COVR0020 = 170;
    public static int COVR0021 = 171;
    public static int COVR0022 = 172;
    public static int COVR0023 = 173;
    public static int COVR0024 = 174;
    public static int CPANBKGE = 175;
    public static int CPANBKG = 176;
    public static int CPANELE = 177;
    public static int CPANEL = 178;
    public static int CREST = 179;
    public static int CSPANBKE = 180;
    public static int CSPANBKG = 181;
    public static int CSPANBTE = 182;
    public static int CSPANBTN = 183;
    public static int CSPANEL = 184;
    public static int CSTLBARB = 185;
    public static int CSTLCAPB = 186;
    public static int CSTLCAPK = 187;
    public static int CSTLCAPN = 188;
    public static int CSTLCAPS = 189;
    public static int CSTLCAPW = 190;
    public static int CSTLCAPZ = 191;
    public static int CSTLKNGT = 192;
    public static int CSTLNECR = 193;
    public static int CSTLSORC = 194;
    public static int CSTLWRLK = 195;
    public static int CSTLWZRD = 196;
    public static int CTRACK00 = 197;
    public static int CTRACK01 = 198;
    public static int CTRACK02 = 199;
    public static int CTRACK03 = 200;
    public static int CTRACK04 = 201;
    public static int CTRACK05 = 202;
    public static int CTRACK06 = 203;
    public static int CURSE = 204;
    public static int CYCLOPS = 205;
    public static int DISRRAY = 206;
    public static int DRAGBLAK = 207;
    public static int DRAGBONE = 208;
    public static int DRAGGREE = 209;
    public static int DRAGRED = 210;
    public static int DRAGSLAY = 211;
    public static int DROPLISL = 212;
    public static int DROPLIST = 213;
    public static int DRUID2 = 214;
    public static int DRUID = 215;
    public static int DRUIDMSL = 216;
    public static int DUMMY = 217;
    public static int DWARF2 = 218;
    public static int DWARF = 219;
    public static int ECPANEL = 220;
    public static int EDITBTNS = 221;
    public static int EDITOR = 222;
    public static int EDITPANL = 223;
    public static int EELEM = 224;
    public static int ELECTRIC = 225;
    public static int ELF2 = 226;
    public static int ELF = 227;
    public static int ELF__MSL = 228;
    public static int ESCROLL = 229;
    public static int ESPANBKG = 230;
    public static int ESPANBTN = 231;
    public static int ESPANEL = 232;
    public static int EVIW_ALL = 233;
    public static int EVIWDDOR = 234;
    public static int EVIWHROS = 235;
    public static int EVIWMINE = 236;
    public static int EVIWPUZL = 237;
    public static int EVIWRSRC = 238;
    public static int EVIWRTFX = 239;
    public static int EVIWTWNS = 240;
    public static int EVIWWRLD = 241;
    public static int EXPMRL = 242;
    public static int EXTRAOVR = 243;
    public static int FELEM = 244;
    public static int FIREBAL2 = 245;
    public static int FIREBALL = 246;
    public static int FLAG32 = 247;
    public static int FONT = 248;
    public static int FRNG0001 = 249;
    public static int FRNG0002 = 250;
    public static int FRNG0003 = 251;
    public static int FRNG0004 = 252;
    public static int FRNG0005 = 253;
    public static int FRNG0006 = 254;
    public static int FRNG0007 = 255;
    public static int FRNG0008 = 256;
    public static int FRNG0009 = 257;
    public static int FRNG0010 = 258;
    public static int FRNG0011 = 259;
    public static int FRNG0012 = 260;
    public static int FRNG0013 = 261;
    public static int FROTH = 262;
    public static int GARGOYLE = 263;
    public static int G_BFLG32 = 264;
    public static int GENIE = 265;
    public static int G_FLAG32 = 266;
    public static int GHOST = 267;
    public static int GOBLIN = 268;
    public static int GOLEM2 = 269;
    public static int GOLEM = 270;
    public static int GRIFFIN = 271;
    public static int GROUND12 = 272;
    public static int GROUND4 = 273;
    public static int GROUND6 = 274;
    public static int HALFLING = 275;
    public static int HALFLMSL = 276;
    public static int HASTE = 277;
    public static int HEROBKG = 278;
    public static int HEROES = 279;
    public static int HEROEXTE = 280;
    public static int HEROEXTG = 281;
    public static int HEROFL00 = 282;
    public static int HEROFL01 = 283;
    public static int HEROFL02 = 284;
    public static int HEROFL03 = 285;
    public static int HEROFL04 = 286;
    public static int HEROFL05 = 287;
    public static int HEROFL06 = 288;
    public static int HEROLOGE = 289;
    public static int HEROLOGO = 290;
    public static int HISCORE = 291;
    public static int HOURGLAS = 292;
    public static int HSBKG = 293;
    public static int HSBTNS = 294;
    public static int HSICONS = 295;
    public static int HYDRA = 296;
    public static int HYPNOTIZ = 297;
    public static int ICECLOUD = 298;
    public static int KEEP = 299;
    public static int KNGT32 = 300;
    public static int LETTER12 = 301;
    public static int LETTER4 = 302;
    public static int LETTER6 = 303;
    public static int LGNDXTRA = 304;
    public static int LGNDXTRE = 305;
    public static int LICH2 = 306;
    public static int LICHCLOD = 307;
    public static int LICH = 308;
    public static int LICH_MSL = 309;
    public static int LISTBOX = 310;
    public static int LISTBOXS = 311;
    public static int LOCATORE = 312;
    public static int LOCATORS = 313;
    public static int MAGE1 = 314;
    public static int MAGE2 = 315;
    public static int MAGEGLDB = 316;
    public static int MAGEGLDK = 317;
    public static int MAGEGLDN = 318;
    public static int MAGEGLDS = 319;
    public static int MAGEGLDW = 320;
    public static int MAGEGLDZ = 321;
    public static int MAGIC01 = 322;
    public static int MAGIC02 = 323;
    public static int MAGIC03 = 324;
    public static int MAGIC04 = 325;
    public static int MAGIC06 = 326;
    public static int MAGIC07 = 327;
    public static int MAGIC08 = 328;
    public static int MANA = 329;
    public static int MEDUSA = 330;
    public static int METEOR = 331;
    public static int MINICAPT = 332;
    public static int MINIHERO = 333;
    public static int MINILKMR = 334;
    public static int MINIMON = 335;
    public static int MINIPORT = 336;
    public static int MINISS = 337;
    public static int MINITOWN = 338;
    public static int MINOTAU2 = 339;
    public static int MINOTAUR = 340;
    public static int MISC12 = 341;
    public static int MISC4 = 342;
    public static int MISC6 = 343;
    public static int MOATPART = 344;
    public static int MOATWHOL = 345;
    public static int MOBILITY = 346;
    public static int MONH0000 = 347;
    public static int MONH0001 = 348;
    public static int MONH0002 = 349;
    public static int MONH0003 = 350;
    public static int MONH0004 = 351;
    public static int MONH0005 = 352;
    public static int MONH0006 = 353;
    public static int MONH0007 = 354;
    public static int MONH0008 = 355;
    public static int MONH0009 = 356;
    public static int MONH0010 = 357;
    public static int MONH0011 = 358;
    public static int MONH0012 = 359;
    public static int MONH0013 = 360;
    public static int MONH0014 = 361;
    public static int MONH0015 = 362;
    public static int MONH0016 = 363;
    public static int MONH0017 = 364;
    public static int MONH0018 = 365;
    public static int MONH0019 = 366;
    public static int MONH0020 = 367;
    public static int MONH0021 = 368;
    public static int MONH0022 = 369;
    public static int MONH0023 = 370;
    public static int MONH0024 = 371;
    public static int MONH0025 = 372;
    public static int MONH0026 = 373;
    public static int MONH0027 = 374;
    public static int MONH0028 = 375;
    public static int MONH0029 = 376;
    public static int MONH0030 = 377;
    public static int MONH0031 = 378;
    public static int MONH0032 = 379;
    public static int MONH0033 = 380;
    public static int MONH0034 = 381;
    public static int MONH0035 = 382;
    public static int MONH0036 = 383;
    public static int MONH0037 = 384;
    public static int MONH0038 = 385;
    public static int MONH0039 = 386;
    public static int MONH0040 = 387;
    public static int MONH0041 = 388;
    public static int MONH0042 = 389;
    public static int MONH0043 = 390;
    public static int MONH0044 = 391;
    public static int MONH0045 = 392;
    public static int MONH0046 = 393;
    public static int MONH0047 = 394;
    public static int MONH0048 = 395;
    public static int MONH0049 = 396;
    public static int MONH0050 = 397;
    public static int MONH0051 = 398;
    public static int MONH0052 = 399;
    public static int MONH0053 = 400;
    public static int MONH0054 = 401;
    public static int MONH0055 = 402;
    public static int MONH0056 = 403;
    public static int MONH0057 = 404;
    public static int MONH0058 = 405;
    public static int MONH0059 = 406;
    public static int MONH0060 = 407;
    public static int MONH0061 = 408;
    public static int MONH0062 = 409;
    public static int MONH0063 = 410;
    public static int MONH0064 = 411;
    public static int MONH0065 = 412;
    public static int MONS32 = 413;
    public static int MORALEB = 414;
    public static int MORALEG = 415;
    public static int MTNCRCK = 416;
    public static int MTNDIRT = 417;
    public static int MTNDSRT = 418;
    public static int MTNGRAS = 419;
    public static int MTNLAVA = 420;
    public static int MTNMULT = 421;
    public static int MTNSNOW = 422;
    public static int MTNSWMP = 423;
    public static int MUMMY2 = 424;
    public static int MUMMYW = 425;
    public static int NECR32 = 426;
    public static int NETBOX = 427;
    public static int NGEXTRA = 428;
    public static int NGHSBKG = 429;
    public static int NGMPBKG = 430;
    public static int NGSPBKG = 431;
    public static int NOMAD = 432;
    public static int O_BFLG32 = 433;
    public static int OBJNARTI = 434;
    public static int OBJNCRCK = 435;
    public static int OBJNDIRT = 436;
    public static int OBJNDSRT = 437;
    public static int OBJNGRA2 = 438;
    public static int OBJNGRAS = 439;
    public static int OBJNHAUN = 440;
    public static int OBJNLAV2 = 441;
    public static int OBJNLAV3 = 442;
    public static int OBJNLAVA = 443;
    public static int OBJNMUL2 = 444;
    public static int OBJNMULT = 445;
    public static int OBJNRSRC = 446;
    public static int OBJNSNOW = 447;
    public static int OBJNSWMP = 448;
    public static int OBJNTOWN = 449;
    public static int OBJNTWBA = 450;
    public static int OBJNTWRD = 451;
    public static int OBJNTWSH = 452;
    public static int OBJNWAT2 = 453;
    public static int OBJNWATR = 454;
    public static int OBJNXTRA = 455;
    public static int OBJPALET = 456;
    public static int O_FLAG32 = 457;
    public static int OGRE2 = 458;
    public static int OGRE = 459;
    public static int ORC2 = 460;
    public static int ORC = 461;
    public static int ORC__MSL = 462;
    public static int OVERBACK = 463;
    public static int OVERLAY = 464;
    public static int OVERVIEW = 465;
    public static int PALADIN2 = 466;
    public static int PALADIN = 467;
    public static int PARALYZE = 468;
    public static int P_BFLG32 = 469;
    public static int PEASANT = 470;
    public static int P_FLAG32 = 471;
    public static int PHOENIX = 472;
    public static int PHYSICAL = 473;
    public static int PIKEMAN2 = 474;
    public static int PIKEMAN = 475;
    public static int PORT0000 = 476;
    public static int PORT0001 = 477;
    public static int PORT0002 = 478;
    public static int PORT0003 = 479;
    public static int PORT0004 = 480;
    public static int PORT0005 = 481;
    public static int PORT0006 = 482;
    public static int PORT0007 = 483;
    public static int PORT0008 = 484;
    public static int PORT0009 = 485;
    public static int PORT0010 = 486;
    public static int PORT0011 = 487;
    public static int PORT0012 = 488;
    public static int PORT0013 = 489;
    public static int PORT0014 = 490;
    public static int PORT0015 = 491;
    public static int PORT0016 = 492;
    public static int PORT0017 = 493;
    public static int PORT0018 = 494;
    public static int PORT0019 = 495;
    public static int PORT0020 = 496;
    public static int PORT0021 = 497;
    public static int PORT0022 = 498;
    public static int PORT0023 = 499;
    public static int PORT0024 = 500;
    public static int PORT0025 = 501;
    public static int PORT0026 = 502;
    public static int PORT0027 = 503;
    public static int PORT0028 = 504;
    public static int PORT0029 = 505;
    public static int PORT0030 = 506;
    public static int PORT0031 = 507;
    public static int PORT0032 = 508;
    public static int PORT0033 = 509;
    public static int PORT0034 = 510;
    public static int PORT0035 = 511;
    public static int PORT0036 = 512;
    public static int PORT0037 = 513;
    public static int PORT0038 = 514;
    public static int PORT0039 = 515;
    public static int PORT0040 = 516;
    public static int PORT0041 = 517;
    public static int PORT0042 = 518;
    public static int PORT0043 = 519;
    public static int PORT0044 = 520;
    public static int PORT0045 = 521;
    public static int PORT0046 = 522;
    public static int PORT0047 = 523;
    public static int PORT0048 = 524;
    public static int PORT0049 = 525;
    public static int PORT0050 = 526;
    public static int PORT0051 = 527;
    public static int PORT0052 = 528;
    public static int PORT0053 = 529;
    public static int PORT0054 = 530;
    public static int PORT0055 = 531;
    public static int PORT0056 = 532;
    public static int PORT0057 = 533;
    public static int PORT0058 = 534;
    public static int PORT0059 = 535;
    public static int PORT0060 = 536;
    public static int PORT0061 = 537;
    public static int PORT0062 = 538;
    public static int PORT0063 = 539;
    public static int PORT0064 = 540;
    public static int PORT0065 = 541;
    public static int PORT0066 = 542;
    public static int PORT0067 = 543;
    public static int PORT0068 = 544;
    public static int PORT0069 = 545;
    public static int PORT0070 = 546;
    public static int PORT0090 = 547;
    public static int PORT0091 = 548;
    public static int PORT0092 = 549;
    public static int PORT0093 = 550;
    public static int PORT0094 = 551;
    public static int PORT0095 = 552;
    public static int PORTCFLG = 553;
    public static int PORTMEDI = 554;
    public static int PORTXTRA = 555;
    public static int PRIMSKIL = 556;
    public static int PUZZLE = 557;
    public static int QWIKHERO = 558;
    public static int QWIKINFO = 559;
    public static int QWIKTOWN = 560;
    public static int RADAR = 561;
    public static int R_BFLG32 = 562;
    public static int RECR2BKG = 563;
    public static int RECRBKG = 564;
    public static int RECRUIT = 565;
    public static int REDBACK = 566;
    public static int REDDEATH = 567;
    public static int REDFIRE = 568;
    public static int REQBKG = 569;
    public static int REQSBKG = 570;
    public static int REQUEST = 571;
    public static int REQUESTS = 572;
    public static int RESOURCE = 573;
    public static int RESSMALL = 574;
    public static int R_FLAG32 = 575;
    public static int ROAD = 576;
    public static int ROC = 577;
    public static int ROGUE = 578;
    public static int ROUTE = 579;
    public static int SCENIBKG = 580;
    public static int SCROLL2 = 581;
    public static int SCROLLCN = 582;
    public static int SCROLLE = 583;
    public static int SCROLL = 584;
    public static int SECSKILL = 585;
    public static int SHADOW32 = 586;
    public static int SHIELD = 587;
    public static int SHNGANIM = 588;
    public static int SKELETON = 589;
    public static int SMALCLOD = 590;
    public static int SMALFONT = 591;
    public static int SMALLBAR = 592;
    public static int SORC32 = 593;
    public static int SPANBKGE = 594;
    public static int SPANBKG = 595;
    public static int SPANBTNE = 596;
    public static int SPANBTN = 597;
    public static int SPANEL = 598;
    public static int SPARKS = 599;
    public static int SPELCO = 600;
    public static int SPELLINF = 601;
    public static int SPELLINL = 602;
    public static int SPELLS = 603;
    public static int SPRITE = 604;
    public static int STELSKIN = 605;
    public static int STONBACK = 606;
    public static int STONBAKE = 607;
    public static int STONEBAK = 608;
    public static int STONEBK2 = 609;
    public static int STONSKIN = 610;
    public static int STORM = 611;
    public static int STREAM = 612;
    public static int STRIP = 613;
    public static int SUNMOONE = 614;
    public static int SUNMOON = 615;
    public static int SURDRBKE = 616;
    public static int SURDRBKG = 617;
    public static int SURRENDE = 618;
    public static int SURRENDR = 619;
    public static int SWAPBTN = 620;
    public static int SWAPWIN = 621;
    public static int SWORDSM2 = 622;
    public static int SWORDSMN = 623;
    public static int SYSTEME = 624;
    public static int SYSTEM = 625;
    public static int TAVWIN = 626;
    public static int TENT = 627;
    public static int TERRAINS = 628;
    public static int TEXTBACK = 629;
    public static int TEXTBAK2 = 630;
    public static int TEXTBAR = 631;
    public static int TITANBLA = 632;
    public static int TITANBLU = 633;
    public static int TITANMSL = 634;
    public static int TOWNBKG0 = 635;
    public static int TOWNBKG1 = 636;
    public static int TOWNBKG2 = 637;
    public static int TOWNBKG3 = 638;
    public static int TOWNBKG4 = 639;
    public static int TOWNBKG5 = 640;
    public static int TOWNFIX = 641;
    public static int TOWNNAME = 642;
    public static int TOWNWIND = 643;
    public static int TRADPOSE = 644;
    public static int TRADPOST = 645;
    public static int TREASURY = 646;
    public static int TREDECI = 647;
    public static int TREEVIL = 648;
    public static int TREFALL = 649;
    public static int TREFIR = 650;
    public static int TREJNGL = 651;
    public static int TRESNOW = 652;
    public static int TROLL2 = 653;
    public static int TROLL = 654;
    public static int TROLLMSL = 655;
    public static int TWNBBOAT = 656;
    public static int TWNBCAPT = 657;
    public static int TWNBCSTL = 658;
    public static int TWNBDOCK = 659;
    public static int TWNBDW_0 = 660;
    public static int TWNBDW_1 = 661;
    public static int TWNBDW_2 = 662;
    public static int TWNBDW_3 = 663;
    public static int TWNBDW_4 = 664;
    public static int TWNBDW_5 = 665;
    public static int TWNBEXT0 = 666;
    public static int TWNBEXT1 = 667;
    public static int TWNBEXT2 = 668;
    public static int TWNBEXT3 = 669;
    public static int TWNBLTUR = 670;
    public static int TWNBMAGE = 671;
    public static int TWNBMARK = 672;
    public static int TWNBMOAT = 673;
    public static int TWNBRTUR = 674;
    public static int TWNBSPEC = 675;
    public static int TWNBSTAT = 676;
    public static int TWNBTENT = 677;
    public static int TWNBTHIE = 678;
    public static int TWNBTVRN = 679;
    public static int TWNBUP_1 = 680;
    public static int TWNBUP_3 = 681;
    public static int TWNBUP_4 = 682;
    public static int TWNBWEL2 = 683;
    public static int TWNBWELL = 684;
    public static int TWNKBOAT = 685;
    public static int TWNKCAPT = 686;
    public static int TWNKCSTL = 687;
    public static int TWNKDOCK = 688;
    public static int TWNKDW_0 = 689;
    public static int TWNKDW_1 = 690;
    public static int TWNKDW_2 = 691;
    public static int TWNKDW_3 = 692;
    public static int TWNKDW_4 = 693;
    public static int TWNKDW_5 = 694;
    public static int TWNKEXT0 = 695;
    public static int TWNKEXT1 = 696;
    public static int TWNKEXT2 = 697;
    public static int TWNKLTUR = 698;
    public static int TWNKMAGE = 699;
    public static int TWNKMARK = 700;
    public static int TWNKMOAT = 701;
    public static int TWNKRTUR = 702;
    public static int TWNKSPEC = 703;
    public static int TWNKSTAT = 704;
    public static int TWNKTENT = 705;
    public static int TWNKTHIE = 706;
    public static int TWNKTVRN = 707;
    public static int TWNKUP_1 = 708;
    public static int TWNKUP_2 = 709;
    public static int TWNKUP_3 = 710;
    public static int TWNKUP_4 = 711;
    public static int TWNKUP_5 = 712;
    public static int TWNKWEL2 = 713;
    public static int TWNKWELL = 714;
    public static int TWNNBOAT = 715;
    public static int TWNNCAPT = 716;
    public static int TWNNCSTL = 717;
    public static int TWNNDOCK = 718;
    public static int TWNNDW_0 = 719;
    public static int TWNNDW_1 = 720;
    public static int TWNNDW_2 = 721;
    public static int TWNNDW_3 = 722;
    public static int TWNNDW_4 = 723;
    public static int TWNNDW_5 = 724;
    public static int TWNNEXT0 = 725;
    public static int TWNNLTUR = 726;
    public static int TWNNMAGE = 727;
    public static int TWNNMARK = 728;
    public static int TWNNMOAT = 729;
    public static int TWNNRTUR = 730;
    public static int TWNNSPEC = 731;
    public static int TWNNSTAT = 732;
    public static int TWNNTENT = 733;
    public static int TWNNTHIE = 734;
    public static int TWNNTVRN = 735;
    public static int TWNNUP_1 = 736;
    public static int TWNNUP_2 = 737;
    public static int TWNNUP_3 = 738;
    public static int TWNNUP_4 = 739;
    public static int TWNNWEL2 = 740;
    public static int TWNNWELL = 741;
    public static int TWNSBOAT = 742;
    public static int TWNSCAPT = 743;
    public static int TWNSCSTL = 744;
    public static int TWNSDOCK = 745;
    public static int TWNSDW_0 = 746;
    public static int TWNSDW_1 = 747;
    public static int TWNSDW_2 = 748;
    public static int TWNSDW_3 = 749;
    public static int TWNSDW_4 = 750;
    public static int TWNSDW_5 = 751;
    public static int TWNSEXT0 = 752;
    public static int TWNSEXT1 = 753;
    public static int TWNSLTUR = 754;
    public static int TWNSMAGE = 755;
    public static int TWNSMARK = 756;
    public static int TWNSMOAT = 757;
    public static int TWNSRTUR = 758;
    public static int TWNSSPEC = 759;
    public static int TWNSSTAT = 760;
    public static int TWNSTENT = 761;
    public static int TWNSTHIE = 762;
    public static int TWNSTVRN = 763;
    public static int TWNSUP_1 = 764;
    public static int TWNSUP_2 = 765;
    public static int TWNSUP_3 = 766;
    public static int TWNSWEL2 = 767;
    public static int TWNSWELL = 768;
    public static int TWNWBOAT = 769;
    public static int TWNWCAPT = 770;
    public static int TWNWCSTL = 771;
    public static int TWNWDOCK = 772;
    public static int TWNWDW_0 = 773;
    public static int TWNWDW_1 = 774;
    public static int TWNWDW_2 = 775;
    public static int TWNWDW_3 = 776;
    public static int TWNWDW_4 = 777;
    public static int TWNWDW_5 = 778;
    public static int TWNWEXT0 = 779;
    public static int TWNWLTUR = 780;
    public static int TWNWMAGE = 781;
    public static int TWNWMARK = 782;
    public static int TWNWMOAT = 783;
    public static int TWNWRTUR = 784;
    public static int TWNWSPEC = 785;
    public static int TWNWSTAT = 786;
    public static int TWNWTENT = 787;
    public static int TWNWTHIE = 788;
    public static int TWNWTVRN = 789;
    public static int TWNWUP_3 = 790;
    public static int TWNWUP5B = 791;
    public static int TWNWUP_5 = 792;
    public static int TWNWWEL2 = 793;
    public static int TWNWWELL = 794;
    public static int TWNZBOAT = 795;
    public static int TWNZCAPT = 796;
    public static int TWNZCSTL = 797;
    public static int TWNZDOCK = 798;
    public static int TWNZDW_0 = 799;
    public static int TWNZDW_1 = 800;
    public static int TWNZDW_2 = 801;
    public static int TWNZDW_3 = 802;
    public static int TWNZDW_4 = 803;
    public static int TWNZDW_5 = 804;
    public static int TWNZEXT0 = 805;
    public static int TWNZLTUR = 806;
    public static int TWNZMAGE = 807;
    public static int TWNZMARK = 808;
    public static int TWNZMOAT = 809;
    public static int TWNZRTUR = 810;
    public static int TWNZSPEC = 811;
    public static int TWNZSTAT = 812;
    public static int TWNZTENT = 813;
    public static int TWNZTHIE = 814;
    public static int TWNZTVRN = 815;
    public static int TWNZUP_2 = 816;
    public static int TWNZUP_4 = 817;
    public static int TWNZUP_5 = 818;
    public static int TWNZWEL2 = 819;
    public static int TWNZWELL = 820;
    public static int UNICORN = 821;
    public static int VAMPIRE2 = 822;
    public static int VAMPIRE = 823;
    public static int VGENBKGE = 824;
    public static int VGENBKG = 825;
    public static int VIEW_ALL = 826;
    public static int VIEWARME = 827;
    public static int VIEWARMY = 828;
    public static int VIEWARSM = 829;
    public static int VIEWDDOR = 830;
    public static int VIEWGEN = 831;
    public static int VIEWHROS = 832;
    public static int VIEWMINE = 833;
    public static int VIEWPUZL = 834;
    public static int VIEWRSRC = 835;
    public static int VIEWRTFX = 836;
    public static int VIEWTWNS = 837;
    public static int VIEWWRLD = 838;
    public static int VWFLAG12 = 839;
    public static int VWFLAG4 = 840;
    public static int VWFLAG6 = 841;
    public static int WELEM = 842;
    public static int WELLBKG = 843;
    public static int WELLXTRA = 844;
    public static int WINCMBBE = 845;
    public static int WINCMBTB = 846;
    public static int WINCMBT = 847;
    public static int WINLOSEB = 848;
    public static int WINLOSEE = 849;
    public static int WINLOSE = 850;
    public static int WOLF = 851;
    public static int WRLK32 = 852;
    public static int WZRD32 = 853;
    public static int X_LOC1 = 854;
    public static int X_LOC2 = 855;
    public static int X_LOC3 = 856;
    public static int XPRIMARY = 857;
    public static int Y_BFLG32 = 858;
    public static int Y_FLAG32 = 859;
    public static int YINYANG = 860;
    public static int ZOMBIE2 = 861;
    public static int ZOMBIE = 862;
    public static int ROUTERED = 863;
    public static int TELEPORT1 = 864;
    public static int TELEPORT2 = 865;
    public static int TELEPORT3 = 866;
    public static int FOUNTAIN = 867;
    public static int TREASURE = 868;
    public static int YELLOW_FONT = 869;
    public static int YELLOW_SMALFONT = 870;
    public static int BATTLESKIP = 871;
    public static int BATTLEWAIT = 872;
    public static int BATTLEAUTO = 873;
    public static int BATTLESETS = 874;
    public static int BUYMAX = 875;
    public static int BTNCONFIG = 876;
    public static int BTNBATTLEONLY = 877;
    public static int BOAT12 = 878;
    public static int BTNGIFT = 879;
    public static int BTNMIN = 880;
    public static int CSLMARKER = 881;
    public static int LASTICN = 882;

    static Map<String, Integer> _names;
    static Map<Integer, String> _toName = new HashMap<>();

    static {
        _names = FileUtils.EnumFieldsOfClass(IcnKind.class);
        for (var name : _names.keySet()) {
            _toName.put(_names.get(name), name);
        }
    }

    public static String GetString(int icn) {
        if (icn == UNKNOWN)
            return "Unknown";
        var actualName = _toName.get(icn);
        return actualName + ".ICN";
    }
}
