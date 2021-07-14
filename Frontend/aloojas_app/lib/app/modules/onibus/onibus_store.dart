import 'package:mobx/mobx.dart';

part 'onibus_store.g.dart';

class OnibusStore = _OnibusStoreBase with _$OnibusStore;
abstract class _OnibusStoreBase with Store {

  @observable
  int value = 0;

  @action
  void increment() {
    value++;
  } 
}