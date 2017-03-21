using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace practica2Cliente
{
    public partial class Form1 : Form
    {
        private localhost.practica2BResponse rp;
        private localhost.practica2BRequest rq;
        private localhost.practica2BBinding sv;
        public Form1()
        {
            InitializeComponent();
            sv = new localhost.practica2BBinding();          
            rq = new localhost.practica2BRequest();           
            rp = new localhost.practica2BResponse();

            labelResultado.Text = "";
        }

        private void buttonComprobar_Click(object sender, EventArgs e)
        {
            rq.numeroUnidades = Int32.Parse(textBoxUnidades.Text);
            rq.referenciaProducto = textBoxReferencia.Text;
            //sv.process(rq);
            rp = this.sv.process(rq);
            labelResultado.Text = rp.result.ToString();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
