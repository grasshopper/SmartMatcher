/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package sm_mm.tests;

import junit.textui.TestRunner;

import sm_mm.Reference;
import sm_mm.Sm_mmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReferenceTest.class);
	}

	/**
	 * Constructs a new Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Reference getFixture() {
		return (Reference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Sm_mmFactory.eINSTANCE.createReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ReferenceTest
