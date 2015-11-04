/**
 */
package experimentOntology.description.gqm.util;

import experimentOntology.description.Describable;

import experimentOntology.description.gqm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.description.gqm.GqmPackage
 * @generated
 */
public class GqmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GqmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GqmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GqmPackage.eINSTANCE;
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
	protected GqmSwitch<Adapter> modelSwitch =
		new GqmSwitch<Adapter>() {
			@Override
			public Adapter caseGQMDescription(GQMDescription object) {
				return createGQMDescriptionAdapter();
			}
			@Override
			public Adapter caseGoalGQM(GoalGQM object) {
				return createGoalGQMAdapter();
			}
			@Override
			public Adapter caseQuestionGQM(QuestionGQM object) {
				return createQuestionGQMAdapter();
			}
			@Override
			public Adapter caseMetricGQM(MetricGQM object) {
				return createMetricGQMAdapter();
			}
			@Override
			public Adapter caseGoals(Goals object) {
				return createGoalsAdapter();
			}
			@Override
			public Adapter caseQuestions(Questions object) {
				return createQuestionsAdapter();
			}
			@Override
			public Adapter caseMetrics(Metrics object) {
				return createMetricsAdapter();
			}
			@Override
			public Adapter caseDescribable(Describable object) {
				return createDescribableAdapter();
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
	 * Creates a new adapter for an object of class '{@link experimentOntology.description.gqm.GQMDescription <em>GQM Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.description.gqm.GQMDescription
	 * @generated
	 */
	public Adapter createGQMDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.description.gqm.GoalGQM <em>Goal GQM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.description.gqm.GoalGQM
	 * @generated
	 */
	public Adapter createGoalGQMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.description.gqm.QuestionGQM <em>Question GQM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.description.gqm.QuestionGQM
	 * @generated
	 */
	public Adapter createQuestionGQMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.description.gqm.MetricGQM <em>Metric GQM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.description.gqm.MetricGQM
	 * @generated
	 */
	public Adapter createMetricGQMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.description.gqm.Goals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.description.gqm.Goals
	 * @generated
	 */
	public Adapter createGoalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.description.gqm.Questions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.description.gqm.Questions
	 * @generated
	 */
	public Adapter createQuestionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.description.gqm.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.description.gqm.Metrics
	 * @generated
	 */
	public Adapter createMetricsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.description.Describable <em>Describable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.description.Describable
	 * @generated
	 */
	public Adapter createDescribableAdapter() {
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

} //GqmAdapterFactory
