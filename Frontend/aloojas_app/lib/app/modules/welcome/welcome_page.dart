import 'package:flutter_modular/flutter_modular.dart';
import 'package:aloojas_app/app/modules/welcome/welcome_store.dart';
import 'package:flutter/material.dart';

class WelcomePage extends StatefulWidget {
  final String title;
  const WelcomePage({Key? key, this.title = 'WelcomePage'}) : super(key: key);
  @override
  WelcomePageState createState() => WelcomePageState();
}
class WelcomePageState extends State<WelcomePage> {
  final WelcomeStore store = Modular.get();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Column(
        children: <Widget>[],
      ),
    );
  }
}