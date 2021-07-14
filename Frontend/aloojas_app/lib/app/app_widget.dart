import 'package:aloojas_app/app/utils/const_colors.dart';
import 'package:flutter/material.dart';
import 'package:flutter_modular/flutter_modular.dart';

class AppWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Aloojas App',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primaryColor: ConstColors.ccGrena,
        scaffoldBackgroundColor: ConstColors.ccGrey,
        canvasColor: ConstColors.ccGrey,
      ),
    ).modular();
  }
}
