import 'package:flutter_test/flutter_test.dart';
import 'package:aloojas_app/app/modules/eventos/eventos_store.dart';
 
void main() {
  late EventosStore store;

  setUpAll(() {
    store = EventosStore();
  });

  test('increment count', () async {
    expect(store.value, equals(0));
    store.increment();
    expect(store.value, equals(1));
  });
}