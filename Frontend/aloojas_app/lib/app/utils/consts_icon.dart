import 'package:aloojas_app/app/utils/const_colors.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';


class ConstIcon {

  static FaIcon getIcon(String type) {
    switch (type) {
      case 'Selecione o destino':
        return FaIcon(FontAwesomeIcons.tools,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Alojas':
        return FaIcon(FontAwesomeIcons.home,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Atletismo':
        return FaIcon(FontAwesomeIcons.running,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Basquete':
        return FaIcon(FontAwesomeIcons.basketballBall,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Festa Noturna':
        return FaIcon(FontAwesomeIcons.glassCheers,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Futebol de Campo':
        return FaIcon(FontAwesomeIcons.futbol,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Futsal':
        return FaIcon(FontAwesomeIcons.solidFutbol,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Handebol':
        return FaIcon(FontAwesomeIcons.baseballBall,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Natação':
        return FaIcon(FontAwesomeIcons.swimmer,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Tênis de Mesa':
        return FaIcon(FontAwesomeIcons.tableTennis,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Tênis':
        return FaIcon(FontAwesomeIcons.tableTennis,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Tenda':
        return FaIcon(FontAwesomeIcons.glassCheers,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Volei':
        return FaIcon(FontAwesomeIcons.volleyballBall,
          color: ConstColors.ccGrena,
          size: 35,);
      case 'Xadrez':
        return FaIcon(FontAwesomeIcons.chessKnight,
          color: ConstColors.ccGrena,
          size: 35,);
      default:
        return FaIcon(FontAwesomeIcons.tools,
          color: ConstColors.ccGrena,
          size: 35,);
    }
  }

}