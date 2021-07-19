import 'package:aloojas_app/app/utils/placeholder_widget.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter_triple/flutter_triple.dart';
class HomeStore extends NotifierStore<Exception, Widget> {
  HomeStore() : super(PlaceholderWidget(Colors.green, 'A'));
  final List<Widget> telas = [
    PlaceholderWidget(Colors.green, 'A'),
    PlaceholderWidget(Colors.red, 'B'),
    PlaceholderWidget(Colors.yellow, 'C'),
  ];

  Future<void> changeScreen(int i) async {
    setLoading(true);
    if(i < 3){
      update(telas[i]);
    }else{
      setError(Exception("ERRO PORRA"));
    }
    setLoading(false);
  }
}