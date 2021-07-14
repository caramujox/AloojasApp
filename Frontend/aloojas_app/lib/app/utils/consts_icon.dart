import 'package:aloojas_app/app/utils/const_colors.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';


class ConstIcon {

  static FaIcon getIcon(String type) {
    switch (type) {
      case 'Selecione o destino':
        return FaIcon(FontAwesomeIcons.tools,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Alojas':
        return FaIcon(FontAwesomeIcons.home,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Atletismo':
        return FaIcon(FontAwesomeIcons.running,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Basquete':
        return FaIcon(FontAwesomeIcons.basketballBall,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Festa Noturna':
        return FaIcon(FontAwesomeIcons.glassCheers,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Futebol de Campo':
        return FaIcon(FontAwesomeIcons.futbol,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Futsal':
        return FaIcon(FontAwesomeIcons.solidFutbol,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Handebol':
        return FaIcon(FontAwesomeIcons.baseballBall,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Natação':
        return FaIcon(FontAwesomeIcons.swimmer,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Tênis de Mesa':
        return FaIcon(FontAwesomeIcons.tableTennis,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Tênis':
        return FaIcon(FontAwesomeIcons.tableTennis,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Tenda':
        return FaIcon(FontAwesomeIcons.glassCheers,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Volei':
        return FaIcon(FontAwesomeIcons.volleyballBall,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      case 'Xadrez':
        return FaIcon(FontAwesomeIcons.chessKnight,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
      default:
        return FaIcon(FontAwesomeIcons.tools,
          color: ConstColors.ccGrena,
          size: 35,);
        break;
    }
  }

}