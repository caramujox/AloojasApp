import 'package:flutter_modular/flutter_modular.dart';
import 'package:aloojas_app/app/modules/onibus/onibus_store.dart';
import 'package:flutter/material.dart';
import 'package:flutter_triple/flutter_triple.dart';

class OnibusPage extends StatefulWidget {
  final String title;
  const OnibusPage({Key? key, this.title = 'OnibusPage'}) : super(key: key);
  @override
  OnibusPageState createState() => OnibusPageState();
}
class OnibusPageState extends State<OnibusPage> {
  final OnibusStore store = Modular.get();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body:  ScopedBuilder<OnibusStore, Exception, List<OnibusModel>>(),      
    );
  }
}