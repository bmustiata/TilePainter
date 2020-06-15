package hellofx.fheroes2.maps;

import hellofx.fheroes2.agg.icn.IcnKind;
import hellofx.fheroes2.common.H2IntPair;
import hellofx.fheroes2.heroes.Direction;
import hellofx.fheroes2.kingdom.H2Color;
import hellofx.fheroes2.kingdom.RaceKind;
import hellofx.fheroes2.objects.*;

import static hellofx.fheroes2.kingdom.WorldDump.writeField;
import static hellofx.fheroes2.kingdom.WorldDump.writeFieldBare;
import static hellofx.fheroes2.serialize.ByteVectorReader.toByte;

public class TilesAddon {

    public int uniq;
    public byte level;
    private byte object;
    private byte index;
    public byte tmp;

    public static H2IntPair ColorRaceFromHeroSprite(TilesAddon ta) {
        H2IntPair res = new H2IntPair();

        if (7 > ta.getIndex())
            res.first = H2Color.BLUE;
        else if (14 > ta.getIndex())
            res.first = H2Color.GREEN;
        else if (21 > ta.getIndex())
            res.first = H2Color.RED;
        else if (28 > ta.getIndex())
            res.first = H2Color.YELLOW;
        else if (35 > ta.getIndex())
            res.first = H2Color.ORANGE;
        else
            res.first = H2Color.PURPLE;

        res.second = RaceKind.NONE;
        switch (ta.index % 7) {
            case 0 -> res.second = RaceKind.KNGT;
            case 1 -> res.second = RaceKind.BARB;
            case 2 -> res.second = RaceKind.SORC;
            case 3 -> res.second = RaceKind.WRLK;
            case 4 -> res.second = RaceKind.WZRD;
            case 5 -> res.second = RaceKind.NECR;
            case 6 -> res.second = RaceKind.RAND;
        }
        return res;
    }

    public static int ColorFromBarrierSprite(TilesAddon ta) {
        // 60, 66, 72, 78, 84, 90, 96, 102
        return IcnKind.X_LOC3 == Mp2Kind.GetICNObject(ta.object) &&
                60 <= ta.getIndex() && 102 >= ta.getIndex()
                ? (ta.getIndex() - 60) / 6 + 1
                : 0;
    }

    public static boolean isMounts(TilesAddon ta) {
        switch (Mp2.GetICNObject(ta.object)) {
            case IcnKind.MTNSNOW:
            case IcnKind.MTNSWMP:
            case IcnKind.MTNLAVA:
            case IcnKind.MTNDSRT:
            case IcnKind.MTNMULT:
            case IcnKind.MTNGRAS:
                return !ObjMnts1.isShadow(ta.getIndex());

            case IcnKind.MTNCRCK:
            case IcnKind.MTNDIRT:
                return !ObjMnts2.isShadow(ta.getIndex());

            default:
                break;
        }

        return false;
    }

    static boolean isWaterResource(TilesAddon ta) {
        return IcnKind.OBJNWATR == Mp2Kind.GetICNObject(ta.object) &&
                (0 == ta.index || // buttle
                        19 == ta.index || // chest
                        45 == ta.index || // flotsam
                        111 == ta.getIndex()) // surviror
                ;
    }

    public TilesAddon() {
    }

    public TilesAddon(int lv, int gid, int obj, int ii) {
        uniq = gid;
        level = (byte) lv;
        object = (byte) obj;
        index = (byte) ii;
        tmp = (0);
    }

    static boolean isWhirlPool(TilesAddon ta) {
        return IcnKind.OBJNWATR == Mp2Kind.GetICNObject(ta.object) &&
                (ta.getIndex() >= 202 && ta.getIndex() <= 225);
    }

    public static boolean ForceLevel1(TilesAddon ta) {
        // broken ship: left roc
        return IcnKind.OBJNWAT2 == Mp2.GetICNObject(ta.object) && ta.index == 11;
    }


    public static boolean isX_LOC123(TilesAddon ta) {
        return IcnKind.X_LOC1 == Mp2Kind.GetICNObject(ta.object) ||
                IcnKind.X_LOC2 == Mp2Kind.GetICNObject(ta.object) ||
                IcnKind.X_LOC3 == Mp2Kind.GetICNObject(ta.object);
    }

    public static boolean ForceLevel2(TilesAddon ta) {
        return false;
    }

    public static int GetLoyaltyObject(TilesAddon addon) {
        switch (Mp2.GetIcnKindObject(addon.object)) {
            case IcnKind.X_LOC1:
                if (toByte(addon.index) == 3) return Mp2Kind.OBJ_ALCHEMYTOWER;
                if (toByte(addon.index) < 3) return Mp2Kind.OBJN_ALCHEMYTOWER;
                if (70 == toByte(addon.index)) return Mp2Kind.OBJ_ARENA;
                if (3 < toByte(addon.index) && toByte(addon.index) < 72) return Mp2Kind.OBJN_ARENA;
                if (77 == toByte(addon.index)) return Mp2Kind.OBJ_BARROWMOUNDS;
                if (71 < toByte(addon.index) && toByte(addon.index) < 78) return Mp2Kind.OBJN_BARROWMOUNDS;
                if (94 == addon.index) return Mp2Kind.OBJ_EARTHALTAR;
                if (77 < toByte(addon.index) && toByte(addon.index) < 112) return Mp2Kind.OBJN_EARTHALTAR;
                if (118 == toByte(addon.index)) return Mp2Kind.OBJ_AIRALTAR;
                if (111 < toByte(addon.index) && toByte(addon.index) < 120) return Mp2Kind.OBJN_AIRALTAR;
                if (127 == toByte(addon.index)) return Mp2Kind.OBJ_FIREALTAR;
                if (119 < toByte(addon.index) && toByte(addon.index) < 129) return Mp2Kind.OBJN_FIREALTAR;
                if (135 == toByte(addon.index)) return Mp2Kind.OBJ_WATERALTAR;
                if (128 < toByte(addon.index) && toByte(addon.index) < 137) return Mp2Kind.OBJN_WATERALTAR;
                break;

            case IcnKind.X_LOC2:
                if (toByte(addon.index) == 4) return Mp2Kind.OBJ_STABLES;
                if (toByte(addon.index) < 4) return Mp2Kind.OBJN_STABLES;
                if (toByte(addon.index) == 9) return Mp2Kind.OBJ_JAIL;
                if (4 < toByte(addon.index) && toByte(addon.index) < 10) return Mp2Kind.OBJN_JAIL;
                if (toByte(addon.index) == 37) return Mp2Kind.OBJ_MERMAID;
                if (9 < toByte(addon.index) && toByte(addon.index) < 47) return Mp2Kind.OBJN_MERMAID;
                if (toByte(addon.index) == 101) return Mp2Kind.OBJ_SIRENS;
                if (46 < toByte(addon.index) && toByte(addon.index) < 111) return Mp2Kind.OBJN_SIRENS;
                if (110 < toByte(addon.index) && toByte(addon.index) < 136) return Mp2Kind.OBJ_REEFS;
                break;

            case IcnKind.X_LOC3:
                if (toByte(addon.index) == 30) return Mp2Kind.OBJ_HUTMAGI;
                if (toByte(addon.index) < 32) return Mp2Kind.OBJN_HUTMAGI;
                if (toByte(addon.index) == 50) return Mp2Kind.OBJ_EYEMAGI;
                if (31 < toByte(addon.index) && toByte(addon.index) < 59) return Mp2Kind.OBJN_EYEMAGI;
                // fix
                break;

            default:
                break;
        }

        return Mp2Kind.OBJ_ZERO;
    }

    static boolean isResource(TilesAddon ta) {
        // OBJNRSRC
        return ((IcnKind.OBJNRSRC == Mp2Kind.GetICNObject(ta.object)) && (ta.getIndex() % 2 != 0)) ||
                // TREASURE
                IcnKind.TREASURE == Mp2Kind.GetICNObject(ta.object);
    }

    public static int ColorFromTravellerTentSprite(TilesAddon ta) {
        //TODO
        return 0;
    }

    static boolean isRandomArtifact(TilesAddon ta) {
        // OBJNARTI
        return IcnKind.OBJNARTI == Mp2Kind.GetICNObject(ta.object) && 0xA3 == ta.getIndex();
    }

    public static boolean isRocs(TilesAddon ta) {
        //TODO
        return false;
    }

    public static boolean isForests(TilesAddon ta) {
        //TODO
        return false;
    }

    public static boolean isTrees(TilesAddon ta) {
        //TODO
        return false;
    }

    public static boolean isCactus(TilesAddon ta) {
        //TODO
        return false;
    }

    public static boolean isShadow(TilesAddon ta) {
        //TODO
        return false;
    }

    @Override
    public String toString() {
        return "{" +
                "level:" + toByte(level) +
                ",object:" + toByte(object) +
                ",index:" + toByte(index) +
                '}';
    }

    static boolean isRandomArtifact1(TilesAddon ta) {
        // OBJNARTI
        return IcnKind.OBJNARTI == Mp2Kind.GetICNObject(ta.object) && 0xA7 == ta.getIndex();
    }

    static boolean isRandomArtifact2(TilesAddon ta) {
        // OBJNARTI
        return IcnKind.OBJNARTI == Mp2Kind.GetICNObject(ta.object) && 0xA9 == ta.getIndex();
    }

    static boolean isStandingStone(TilesAddon ta) {
        return IcnKind.OBJNMULT == Mp2Kind.GetICNObject(ta.object) &&
                (ta.index == 84 || ta.index == 85);
    }

    static boolean isRandomArtifact3(TilesAddon ta) {
        // OBJNARTI
        return IcnKind.OBJNARTI == Mp2Kind.GetICNObject(ta.object) && 0xAB == ta.getIndex();
    }

    static boolean isRandomResource(TilesAddon ta) {
        // OBJNRSRC
        return IcnKind.OBJNRSRC == Mp2Kind.GetICNObject(ta.object) && 17 == ta.index;
    }

    static boolean isArtifact(TilesAddon ta) {
        // OBJNARTI (skip ultimate)
        return IcnKind.OBJNARTI == Mp2Kind.GetICNObject(ta.object) && ta.index > 0x10 && (ta.index % 2 != 0);
    }

    static boolean isUltimateArtifact(TilesAddon ta) {
        // OBJNARTI
        return IcnKind.OBJNARTI == Mp2Kind.GetICNObject(ta.object) && 0xA4 == ta.getIndex();
    }

    static boolean isCampFire(TilesAddon ta) {
        // MTNDSRT
        return (IcnKind.OBJNDSRT == Mp2Kind.GetICNObject(ta.object) && 61 == ta.getIndex()) ||
                // OBJNMULT
                (IcnKind.OBJNMULT == Mp2Kind.GetICNObject(ta.object) && 131 == ta.getIndex()) ||
                // OBJNSNOW
                (IcnKind.OBJNSNOW == Mp2Kind.GetICNObject(ta.object) && 4 == ta.getIndex());
    }

    static boolean isWateringHole(TilesAddon ta) {
        return IcnKind.OBJNCRCK == Mp2Kind.GetICNObject(ta.object) &&
                (ta.getIndex() >= 217 && ta.getIndex() <= 220);
    }

    static boolean isEvent(TilesAddon ta) {
        // OBJNMUL2
        return IcnKind.OBJNMUL2 == Mp2Kind.GetICNObject(ta.object) && 0xA3 == ta.getIndex();
    }

    static boolean isRandomCastle(TilesAddon ta) {
        // OBJNTWRD
        return IcnKind.OBJNTWRD == Mp2Kind.GetICNObject(ta.object) && 32 > ta.getIndex();
    }

    static boolean isRandomMonster(TilesAddon ta) {
        // MONS32
        return IcnKind.MONS32 == Mp2Kind.GetICNObject(ta.object) &&
                (0x41 < ta.getIndex() && 0x47 > ta.getIndex());
    }

    static boolean isMonster(TilesAddon ta) {
        // MONS32
        return IcnKind.MONS32 == Mp2Kind.GetICNObject(ta.object);
    }

    static boolean isArtesianSpring(TilesAddon ta) {
        return IcnKind.OBJNCRCK == Mp2Kind.GetICNObject(ta.object) &&
                (ta.index == 3 || ta.index == 4);
    }

    static boolean isSkeleton(TilesAddon ta) {
        return IcnKind.OBJNDSRT == Mp2Kind.GetICNObject(ta.object) && ta.index == 84;
    }

    static boolean isOasis(TilesAddon ta) {
        return IcnKind.OBJNDSRT == Mp2Kind.GetICNObject(ta.object) &&
                (ta.index == 108 || ta.index == 109);
    }

    static boolean isBarrier(TilesAddon ta) {
        return IcnKind.X_LOC3 == Mp2Kind.GetICNObject(ta.object) &&
                60 <= ta.getIndex() && 102 >= ta.getIndex() && 0 == ta.getIndex() % 6;
    }

    static boolean isJail(TilesAddon ta) {
        return IcnKind.X_LOC2 == Mp2Kind.GetICNObject(ta.object) && 0x09 == ta.index;
    }

    static boolean isStream(TilesAddon ta) {
        return IcnKind.STREAM == Mp2Kind.GetICNObject(ta.object) ||
                (IcnKind.OBJNMUL2 == Mp2Kind.GetICNObject(ta.object) && ta.getIndex() < 14);
    }

    static boolean isMine(TilesAddon ta) {
        // EXTRAOVR
        return IcnKind.EXTRAOVR == Mp2Kind.GetICNObject(ta.object);
    }

    static boolean isBoat(TilesAddon ta) {
        // OBJNWAT2
        return IcnKind.OBJNWAT2 == Mp2Kind.GetICNObject(ta.object) && 0x17 == ta.index;
    }

    static boolean isMiniHero(TilesAddon ta) {
        // MINIHERO
        return IcnKind.MINIHERO == Mp2Kind.GetICNObject(ta.object);
    }

    static boolean isCastle(TilesAddon ta) {
        // OBJNTOWN
        return IcnKind.OBJNTOWN == Mp2Kind.GetICNObject(ta.object);
    }

    public static int GetPassable(TilesAddon ta) {
        var icn = Mp2.GetICNObject(ta.object);

        switch (icn) {
            case IcnKind.MTNSNOW:
            case IcnKind.MTNSWMP:
            case IcnKind.MTNLAVA:
            case IcnKind.MTNDSRT:
            case IcnKind.MTNMULT:
            case IcnKind.MTNGRAS:
                return ObjMnts1.GetPassable(icn, ta.getIndex());

            case IcnKind.MTNCRCK:
            case IcnKind.MTNDIRT:
                return ObjMnts2.GetPassable(icn, ta.getIndex());

            case IcnKind.TREJNGL:
            case IcnKind.TREEVIL:
            case IcnKind.TRESNOW:
            case IcnKind.TREFIR:
            case IcnKind.TREFALL:
            case IcnKind.TREDECI:
                return ObjTree.GetPassable(ta.getIndex());
            case IcnKind.OBJNSNOW:
                return ObjSnow.GetPassable(ta.getIndex());
            case IcnKind.OBJNSWMP:
                return ObjSwmp.GetPassable(ta.getIndex());
            case IcnKind.OBJNGRAS:
                return ObjGras.GetPassable(ta.getIndex());
            case IcnKind.OBJNGRA2:
                return ObjGra2.GetPassable(ta.getIndex());
            case IcnKind.OBJNCRCK:
                return ObjCrck.GetPassable(ta.getIndex());
            case IcnKind.OBJNDIRT:
                return ObjDirt.GetPassable(ta.getIndex());
            case IcnKind.OBJNDSRT:
                return ObjDsrt.GetPassable(ta.getIndex());
            case IcnKind.OBJNMUL2:
                return ObjMul2.GetPassable(ta.getIndex());
            case IcnKind.OBJNMULT:
                return ObjMult.GetPassable(ta.getIndex());
            case IcnKind.OBJNLAVA:
                return ObjLava.GetPassable(ta.getIndex());
            case IcnKind.OBJNLAV3:
                return ObjLav3.GetPassable(ta.getIndex());
            case IcnKind.OBJNLAV2:
                return ObjLav2.GetPassable(ta.getIndex());
            case IcnKind.OBJNWAT2:
                return ObjWat2.GetPassable(ta.getIndex());
            case IcnKind.OBJNWATR:
                return ObjWatr.GetPassable(ta.getIndex());

            case IcnKind.OBJNTWBA:
                return ObjTwba.GetPassable(ta.getIndex());
            case IcnKind.OBJNTOWN:
                return ObjTown.GetPassable(ta.getIndex());

            case IcnKind.X_LOC1:
                return ObjXlc1.GetPassable(ta.getIndex());
            case IcnKind.X_LOC2:
                return ObjXlc2.GetPassable(ta.getIndex());
            case IcnKind.X_LOC3:
                return ObjXlc3.GetPassable(ta.getIndex());

            // MANUAL.ICN
            case IcnKind.TELEPORT1:
            case IcnKind.TELEPORT2:
            case IcnKind.TELEPORT3:
            case IcnKind.FOUNTAIN:
                return 0;

            default:
                break;
        }

        return Direction.DIRECTION_ALL;
    }

    public int getObject() {
        return toByte(object);
    }

    public void setObject(int object) {
        if (uniq == 142) {
            System.out.println("Here");
        }
        this.object = (byte) object;
    }

    public int getIndex() {
        return toByte(index);
    }

    static boolean isRoad(TilesAddon ta) {
        return IcnKind.ROAD == Mp2Kind.GetICNObject(ta.object);
    }

    boolean isSkeletonFix(TilesAddon ta) {
        return IcnKind.OBJNDSRT == Mp2Kind.GetICNObject(ta.object) && ta.index == 83;
    }

    boolean isUniq(int id) {
        return uniq == id;
    }

    boolean isICN(int icn) {
        return icn == Mp2.GetICNObject(object);
    }

    public void setIndex(int index) {
        this.index = (byte) index;
    }

    public String toJsonRow() {
        var sb = new StringBuilder();
        sb.append("{");
        writeField(sb, "uniq", uniq);
        writeField(sb, "level", toByte(level));
        writeField(sb, "object", toByte(object));
        writeFieldBare(sb, "index", toByte(index));

        sb.append("}");
        return sb.toString();
    }
}
