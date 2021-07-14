import 'package:flutter/material.dart';

class PlaceholderWidget extends StatelessWidget {

  final Color color;
  final String test;

  PlaceholderWidget(this.color, this.test);

  @override
  Widget build(BuildContext context) {
    return Container(
      color: color,
      child: Text(test),
    );
  }

}
