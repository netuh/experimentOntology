/**
 */
package experimentOntology.planning.designOfExperiment.util;

import experimentOntology.planning.designOfExperiment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage
 * @generated
 */
public class DesignOfExperimentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DesignOfExperimentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignOfExperimentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DesignOfExperimentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignOfExperimentSwitch<Adapter> modelSwitch =
		new DesignOfExperimentSwitch<Adapter>() {
			@Override
			public Adapter caseDesignType(DesignType object) {
				return createDesignTypeAdapter();
			}
			@Override
			public Adapter caseDesignDiscipline(DesignDiscipline object) {
				return createDesignDisciplineAdapter();
			}
			@Override
			public Adapter caseRandomizedDiscipline(RandomizedDiscipline object) {
				return createRandomizedDisciplineAdapter();
			}
			@Override
			public Adapter caseBlockDesignDiscipline(BlockDesignDiscipline object) {
				return createBlockDesignDisciplineAdapter();
			}
			@Override
			public Adapter caseBalancedDesignDiscipline(BalancedDesignDiscipline object) {
				return createBalancedDesignDisciplineAdapter();
			}
			@Override
			public Adapter caseBlockedCharacteristic(BlockedCharacteristic object) {
				return createBlockedCharacteristicAdapter();
			}
			@Override
			public Adapter caseOneFactorDesign(OneFactorDesign object) {
				return createOneFactorDesignAdapter();
			}
			@Override
			public Adapter caseTwoTreatmentDesign(TwoTreatmentDesign object) {
				return createTwoTreatmentDesignAdapter();
			}
			@Override
			public Adapter caseMultTreatmentDesign(MultTreatmentDesign object) {
				return createMultTreatmentDesignAdapter();
			}
			@Override
			public Adapter caseTwoFactorDesign(TwoFactorDesign object) {
				return createTwoFactorDesignAdapter();
			}
			@Override
			public Adapter caseSquareDesign(SquareDesign object) {
				return createSquareDesignAdapter();
			}
			@Override
			public Adapter caseNestedFactorDesign(NestedFactorDesign object) {
				return createNestedFactorDesignAdapter();
			}
			@Override
			public Adapter caseTriFactorDesign(TriFactorDesign object) {
				return createTriFactorDesignAdapter();
			}
			@Override
			public Adapter caseGenericDesign(GenericDesign object) {
				return createGenericDesignAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.DesignType <em>Design Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.DesignType
	 * @generated
	 */
	public Adapter createDesignTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.DesignDiscipline <em>Design Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.DesignDiscipline
	 * @generated
	 */
	public Adapter createDesignDisciplineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.RandomizedDiscipline <em>Randomized Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.RandomizedDiscipline
	 * @generated
	 */
	public Adapter createRandomizedDisciplineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.BlockDesignDiscipline <em>Block Design Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.BlockDesignDiscipline
	 * @generated
	 */
	public Adapter createBlockDesignDisciplineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.BalancedDesignDiscipline <em>Balanced Design Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.BalancedDesignDiscipline
	 * @generated
	 */
	public Adapter createBalancedDesignDisciplineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.BlockedCharacteristic <em>Blocked Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.BlockedCharacteristic
	 * @generated
	 */
	public Adapter createBlockedCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.OneFactorDesign <em>One Factor Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.OneFactorDesign
	 * @generated
	 */
	public Adapter createOneFactorDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.TwoTreatmentDesign <em>Two Treatment Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.TwoTreatmentDesign
	 * @generated
	 */
	public Adapter createTwoTreatmentDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.MultTreatmentDesign <em>Mult Treatment Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.MultTreatmentDesign
	 * @generated
	 */
	public Adapter createMultTreatmentDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.TwoFactorDesign <em>Two Factor Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.TwoFactorDesign
	 * @generated
	 */
	public Adapter createTwoFactorDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.SquareDesign <em>Square Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.SquareDesign
	 * @generated
	 */
	public Adapter createSquareDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.NestedFactorDesign <em>Nested Factor Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.NestedFactorDesign
	 * @generated
	 */
	public Adapter createNestedFactorDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.TriFactorDesign <em>Tri Factor Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.TriFactorDesign
	 * @generated
	 */
	public Adapter createTriFactorDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.designOfExperiment.GenericDesign <em>Generic Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.designOfExperiment.GenericDesign
	 * @generated
	 */
	public Adapter createGenericDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DesignOfExperimentAdapterFactory
