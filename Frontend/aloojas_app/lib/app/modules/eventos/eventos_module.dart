import 'package:aloojas_app/app/modules/eventos/eventos_Page.dart';
import 'package:aloojas_app/app/modules/eventos/eventos_store.dart';
import 'package:flutter_modular/flutter_modular.dart';

class EventosModule extends Module {
  @override
  final List<Bind> binds = [
    Bind.lazySingleton((i) => EventosStore()),
  ];

  @override
  final List<ModularRoute> routes = [
    ChildRoute('/', child: (_, args) => EventosPage()),
  ];
}
