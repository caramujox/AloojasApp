
import 'package:aloojas_app/app/modules/eventos/eventos_model.dart';
import 'package:aloojas_app/app/modules/eventos/interfaces/evento_repository_interface.dart';
import 'package:flutter_modular/flutter_modular.dart';

class EventoRepository extends Disposable implements IEventoRepository{
  @override
  Future deleteEvento(EventoModel eventoModel) {
    // TODO: implement deleteEvento
    throw UnimplementedError();
  }

  @override
  void dispose() {
    // TODO: implement dispose
  }

  @override
  Stream<List<EventoModel>> findAllEvento() {
    // TODO: implement findAllEvento
    throw UnimplementedError();
  }

  @override
  Future insertEvento(EventoModel eventoModel) {
    // TODO: implement insertEvento
    throw UnimplementedError();
  }

  @override
  Future updateEvento(String nomeEvento, EventoModel eventoModel) {
    // TODO: implement updateEvento
    throw UnimplementedError();
  }

}