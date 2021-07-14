import 'package:aloojas_app/app/utils/const_colors.dart';
import 'package:aloojas_app/app/utils/placeholder_widget.dart';
import 'package:flutter/material.dart';
import 'package:flutter_modular/flutter_modular.dart';
import 'package:flutter_triple/flutter_triple.dart';
import 'package:google_fonts/google_fonts.dart';
import 'home_store.dart';

class HomePage extends StatefulWidget {
  final String title;
  const HomePage({Key? key, this.title = "Home"}) : super(key: key);

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends ModularState<HomePage, HomeStore> {
  int _currentIndex = 0;


  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: _buildAppBar(),
      body: ScopedBuilder<HomeStore, Exception, Widget>(
        store: store,
        onState: (_, screen) {
          return screen;
        },
        onError: (context, error) => Center(
          child: Text(
            'Too many clicks',
            style: TextStyle(color: Colors.red),
          ),
        ),
        onLoading: (context) => CircularProgressIndicator(),
      ),
      bottomNavigationBar: BottomNavigationBar(
        onTap: (i) {
          store.changeScreen(i);
        },
        backgroundColor: ConstColors.ccGrena,
        selectedItemColor: Colors.white,
        currentIndex: _currentIndex,     
        type: BottomNavigationBarType.fixed,
        items: <BottomNavigationBarItem>[
          BottomNavigationBarItem(
            label: 'Home',            
            icon: Icon(Icons.home),
          ),
          BottomNavigationBarItem(
            label: 'Bus',
            icon: Icon(Icons.directions_bus),
          ),
          BottomNavigationBarItem(
            label: 'Jogos',
            icon: Icon(Icons.assignment),
          ),
        ],
      ),
    );
  }
}

_buildAppBar() {
  return AppBar(
    title: Text(
      'Aloojas',
      style: GoogleFonts.permanentMarker(
        fontSize: 25,
      ),
    ),
  );
}
