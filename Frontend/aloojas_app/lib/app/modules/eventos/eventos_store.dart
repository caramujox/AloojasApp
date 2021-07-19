

import 'package:aloojas_app/app/modules/eventos/eventos_model.dart';
import 'package:flutter_triple/flutter_triple.dart';

class EventosStore extends NotifierStore<Exception, EventoModel>{
  EventosStore(EventoModel initialState) : super(initialState);

}