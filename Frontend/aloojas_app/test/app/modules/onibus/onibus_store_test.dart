import 'package:flutter_test/flutter_test.dart';
import 'package:aloojas_app/app/modules/onibus/onibus_store.dart';
 
void main() {
  late OnibusStore store;

  setUpAll(() {
    store = OnibusStore();
  });

  test('increment count', () async {
    expect(store.value, equals(0));
    store.increment();
    expect(store.value, equals(1));
  });
}