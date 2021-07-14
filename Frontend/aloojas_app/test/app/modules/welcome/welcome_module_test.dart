import 'package:flutter_modular_test/flutter_modular_test.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:aloojas_app/app/modules/welcome/welcome_module.dart';
 
void main() {

  setUpAll(() {
    initModule(WelcomeModule());
  });
}