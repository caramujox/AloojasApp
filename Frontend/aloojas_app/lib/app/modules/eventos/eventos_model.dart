

import 'package:flutter/material.dart';

@immutable
class EventoModel {
  final String nome, pontoEncontro, horarioEvento;

  EventoModel({required this.nome, required this.pontoEncontro, required this.horarioEvento});

  factory EventoModel.fromJson(Map<String, dynamic> json){
    return EventoModel(
      horarioEvento: json['horarioEvento'],
      nome: json['nomeEvento'],
      pontoEncontro: json['pontoEncontro']
      );
  }
}