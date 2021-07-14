import 'package:aloojas_app/app/modules/onibus/onibus_Page.dart';
import 'package:aloojas_app/app/modules/onibus/onibus_store.dart';
import 'package:flutter_modular/flutter_modular.dart';

class OnibusModule extends Module {
  @override
  final List<Bind> binds = [
    Bind.lazySingleton((i) => OnibusStore()),
  ];

  @override
  final List<ModularRoute> routes = [
    ChildRoute('/', child: (_, args) => OnibusPage()),
  ];
}
