import 'package:aloojas_app/app/modules/eventos/eventos_Page.dart';
import 'package:aloojas_app/app/modules/eventos/eventos_model.dart';
import 'package:aloojas_app/app/modules/eventos/eventos_store.dart';
import 'package:flutter_modular/flutter_modular.dart';

class EventosModule extends Module {
  @override
  final List<Bind> binds = [
    Bind.lazySingleton((i) => EventosStore(new EventoModel(nome: "nome", pontoEncontro: "pontoEncontro", horarioEvento: "horarioEvento"))),
  ];

  @override
  final List<ModularRoute> routes = [
    ChildRoute('/', child: (_, args) => EventosPage()),
  ];
}
