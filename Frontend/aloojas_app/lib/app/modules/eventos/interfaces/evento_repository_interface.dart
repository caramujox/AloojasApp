

import 'package:aloojas_app/app/modules/eventos/eventos_model.dart';

abstract class IEventoRepository {
  //Get all Eventos
  Stream<List<EventoModel>> findAllEvento();
  //Insert novo Evento
  Future insertEvento(EventoModel eventoModel);
  //Update existing Evento
  Future updateEvento(String nomeEvento, EventoModel eventoModel);
  //Delete Evento
  Future deleteEvento(EventoModel eventoModel);
}